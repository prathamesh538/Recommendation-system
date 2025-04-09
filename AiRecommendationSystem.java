package com.example.recommendationsystem;

import org.apache.mahout.cf.taste.common.TasteException;
import org.apache.mahout.cf.taste.impl.model.file.FileDataModel;
import org.apache.mahout.cf.taste.impl.neighborhood.NearestNUserNeighborhood;
import org.apache.mahout.cf.taste.impl.recommender.GenericUserBasedRecommender;
import org.apache.mahout.cf.taste.model.DataModel;
import org.apache.mahout.cf.taste.neighborhood.UserNeighborhood;
import org.apache.mahout.cf.taste.recommender.RecommendedItem;
import org.apache.mahout.cf.taste.recommender.UserBasedRecommender;
import org.apache.mahout.cf.taste.similarity.UserSimilarity;
import org.apache.mahout.cf.taste.impl.similarity.PearsonCorrelationSimilarity;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class RecommendationSystem {

    public static void main(String[] args) throws IOException, TasteException {

        // Sample data: user ratings for products (user ID, item ID, rating)
        // Store this data in a CSV file (e.g., "ratings.csv")
        // Example ratings.csv content:
        // 1,101,5.0
        // 1,102,3.0
        // 2,101,2.0
        // 2,103,4.0
        // 3,102,4.0
        // 3,103,5.0
        // 4,101,3.0
        // 4,102,2.0
        // 4,103,1.0

        DataModel model = new FileDataModel(new File("ratings.csv"));

        UserSimilarity similarity = new PearsonCorrelationSimilarity(model);
        UserNeighborhood neighborhood = new NearestNUserNeighborhood(2, similarity, model); // 2 nearest neighbors

        UserBasedRecommender recommender = new GenericUserBasedRecommender(model, neighborhood, similarity);

        // Get recommendations for user ID 4
        List<RecommendedItem> recommendations = recommender.recommend(4, 2); // Recommend 2 items

        if (recommendations.isEmpty()) {
            System.out.println("No recommendations for user 4.");
        } else {
            System.out.println("Recommendations for user 4:");
            for (RecommendedItem recommendation : recommendations) {
                System.out.println("Item ID: " + recommendation.getItemID() + ", Estimated Preference: " + recommendation.getValue());
            }
        }
    }
}
