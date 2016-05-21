package threads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import reader.StateReader;
import reports.HashtagReport;
import reports.ReportInfo;
import tweetsData.Tweet;

public class FirstReport extends Thread {
    
    private ArrayList<Tweet> selectedTweets;
    private ReportInfo info;
    
    public FirstReport(ReportInfo info) {
        this.info = info;
    }
        
    
     public void run(){
         HashtagReport tagReport = new HashtagReport();
         this.setSelectedTweets(tagReport.getReportResult(this.info));
    }

    /**
     * @return the selectedTweets
     */
    public ArrayList<Tweet> getSelectedTweets() {
        return selectedTweets;
    }

    /**
     * @param selectedTweets the selectedTweets to set
     */
    public void setSelectedTweets(ArrayList<Tweet> selectedTweets) {
        this.selectedTweets = selectedTweets;
    }


}
