
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MovieFactory {

    private NodeList allRecords;
    private Document movieList;

    public MovieFactory (String movieXML){
        XMLFileReader movieFile = new XMLFileReader(movieXML);
        movieList = movieFile.getXMLFile();
        setAllRecords();
    }

    public void setAllRecords() {
        this.allRecords = movieList.getElementsByTagName("record") ;
    }

    public NodeList getAllRecords() {
        return allRecords;
    }

    public void printAllMovieNames(){
        for (int i = 0 ; i < allRecords.getLength(); i++){
            Node movies = allRecords.item(i);
            Element movieName = (Element) movies;
            System.out.println(movieName.getElementsByTagName("movie_name").item(0).getTextContent());
        }
    }

    public boolean genreCheck() {

        boolean anyInt = false;

        while (anyInt == false) {
            for (int i = 0; i < allRecords.getLength(); i++) {

                Node movies = allRecords.item(i);
                movies.getChildNodes();
                Element movieGenre = (Element) movies.getChildNodes();

                if (movieGenre != null) {
                    Pattern p = Pattern.compile("[0-9]");
                    Matcher m = p.matcher(movieGenre.getElementsByTagName("movie_genre").item(0).getTextContent());

                    if (m.find()) {
                        System.out.println(m.group());
                        anyInt = true;
                    }
                }
            }
        }

        return anyInt;
    }




















//    public boolean allRecordsHaveThreeElements(){
//        for (int i =0; i< allRecords.getLength(); i++){
//
//        }
//    }
//
//    public boolean noNullMovieNames(){
//
//    }
//
//    public boolean noNullMovieGenres(){
//
//    }
//
//    public boolean noNullMovieCost(){
//
//    }

    // noNullRecords - utilise nullmethods (boolean)
    // no more than three genres in a record
    // no other item can be over the most expensive
    // all prices have only two decimal places

}
