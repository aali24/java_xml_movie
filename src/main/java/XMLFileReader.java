import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLFileReader {

    private Document XMLFile;
    private DocumentBuilder movieBuilder;
    private DocumentBuilderFactory moviexmlfactory;

    public XMLFileReader(String filePath){
        try {
            File moviexml = new File(filePath);
            DocumentBuilderFactory moviexmlfactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder movieBuilder = moviexmlfactory.newDocumentBuilder();
            XMLFile = movieBuilder.parse(moviexml);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }

    public Document getXMLFile() {
        return XMLFile;
    }



}
