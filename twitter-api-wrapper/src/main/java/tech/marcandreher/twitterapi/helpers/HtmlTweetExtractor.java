package tech.marcandreher.twitterapi.helpers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlTweetExtractor {

    private String toParse;

    public HtmlTweetExtractor(String toParse) {
        this.toParse = toParse;
    }

    public String extractTweetText() {
        Document doc = Jsoup.parse(toParse);
        Elements blockquote = doc.select("blockquote.twitter-tweet");
        if (!blockquote.isEmpty()) {
            Element p = blockquote.select("p").first();
            if (p != null) {
                return p.text();
            }
        }
        return null;
    }

    public String extractProfilePicUrl() {
        Document doc = Jsoup.parse(toParse);
        Elements img = doc.select("img.profile-pic");
        if (img != null) {
            Element imgElement = img.first();
            if (imgElement != null) {
                return imgElement.attr("src");
            }
        }
        return null;
    }
    
}
