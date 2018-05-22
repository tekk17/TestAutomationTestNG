import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.Hashtable;

public class XMLReadWrite {
	public static Hashtable<String, Hashtable<String, String>> getElementParamsByTitle(String absoluteFilePath) throws Exception {
		Hashtable<String, Hashtable<String, String>> elementParams = new Hashtable<String, Hashtable<String, String>>();
		try {
			File file = new File(absoluteFilePath);
			if(file.isFile()) {
				DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
				Document doc = documentBuilder.parse(file);
				NodeList nodeList = doc.getElementsByTagName("Element");
				for (int node = 0; node < nodeList.getLength(); node++) {
					Hashtable<String, String> childElements = new Hashtable<String, String>();
					Element param = (Element) nodeList.item(node);
					if (!param.getAttribute("title").toString().equals("")) {
						for (Node childNode = param.getFirstChild(); childNode != null; childNode = childNode.getNextSibling()) {
							if (childNode.getNodeType() == Node.ELEMENT_NODE) {
								childElements.put(childNode.getNodeName(),childNode.getTextContent());
							}
						}
						elementParams.put(param.getAttribute("title").toString(), childElements);
					}
				}
			}
		} catch (Exception e) {
			//log.error("Exception in XmlReaderWriter getElementParamsByTitle() :: ", e);
			throw new Exception("Exception in XmlReaderWriter getElementParamsByTitle() :: " + e.getMessage());
		}
		return elementParams;
	}

	public static void main(String[] args) throws Exception {
		String absoluteFilePath = "./resources/CatalogPage.xml";
		Hashtable<String, Hashtable<String, String>> elementParams = getElementParamsByTitle(absoluteFilePath);

		System.out.println(elementParams);
	}
}
