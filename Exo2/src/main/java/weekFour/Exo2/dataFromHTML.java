package weekFour.Exo2;

public class dataFromHTML {
    private String inputToCount; // Name there need to be the same as the name in the HTML file
    public String getInputToCount() {
        return inputToCount;
    }

    public void setInputToCount(String inputToCount) {
        this.inputToCount = inputToCount;
    }

    @Override
    public String toString() {
        return inputToCount;
    }
}
