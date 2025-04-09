# Recommendation System (Java - Apache Mahout)

*COMPANY*:CODTECH IT SOLUTIONS

*NAME*:PRATHAMESH SANJAY PATHARE

*INTERN ID*:CT08WPS

*DOMAIN*:JAVA PROGRAMMING

*DURATION*:4 WEEKS

*MENTOR*:NEELA SANTOSH KUMAR

This Java project implements a basic recommendation system using the Apache Mahout library. It demonstrates user-based collaborative filtering to suggest items to users based on their past ratings.

## Features

* **User-Based Collaborative Filtering:** Recommends items based on the preferences of similar users.
* **Pearson Correlation Similarity:** Calculates user similarity using Pearson correlation.
* **Nearest Neighbor Approach:** Uses the `NearestNUserNeighborhood` algorithm to find similar users.
* **CSV Data Input:** Reads user ratings from a simple CSV file (`ratings.csv`).
* **Maven Dependency Management:** Uses Maven to manage project dependencies.

## Prerequisites

* **Java Development Kit (JDK):** Version 8 or later.
* **Apache Maven:** For building and managing dependencies.
* **NetBeans (or any IDE):** For development and execution.

## Getting Started

1.  **Clone the Repository (Optional):** If you are using Git, clone this repository to your local machine.
2.  **Create `ratings.csv`:**
    * Create a file named `ratings.csv` in the root directory of the project.
    * Populate it with user ratings in the following format: `userId,itemId,rating`.
    * Example:

        ```csv
        1,101,5.0
        1,102,3.0
        2,101,2.0
        2,103,4.0
        3,102,4.0
        3,103,5.0
        4,101,3.0
        4,102,2.0
        4,103,1.0
        ```

3.  **Build the Project:**
    * If using NetBeans, open the project and click "Clean and Build Project."
    * Alternatively, from the command line, navigate to the project directory and run `mvn clean install`.

4.  **Run the Application:**
    * If using NetBeans, run the `RecommendationSystem.java` file.
    * From the command line, navigate to the `target/classes` directory and run `java RecommendationSystem`.

5.  **View Recommendations:**
    * The recommendations will be printed to the console.

## output
![image](https://github.com/user-attachments/assets/4059758a-d238-435c-b78d-abfd8edd52c3)
