package Unit3_Boolean.examples;
//GITHUB EDIT TEST
public class Review {

    private String reviewerName;
    private String businessName;
    private int rating;

    public Review(String reviewerName, String businessName, int rating) {
        this.reviewerName = reviewerName;
        this.businessName = businessName;
        this.rating = rating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public void setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }


    public String toString() {
        String output = reviewerName + ", " + businessName + ", " + rating + "\n";
        if(rating == 5){
            output += "\t ** " + "Highly Recommended \n";
        }
        else if (rating == 1){
            output += "\t ** " +  "Strongly Discouraged \n";
        }

        return output;

    }

}

