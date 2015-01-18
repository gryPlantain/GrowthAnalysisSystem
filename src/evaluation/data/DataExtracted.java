package evaluation.data;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import evaluation.index.IndexAid;

public class DataExtracted {
	
	private File[] files; //所有文件名
	private ArrayList<String> elements;  //所有标签名
	private ArrayList<String> attributes; //所有属性
	private ArrayList<IndexAid> index;   //辅助指标，保存xbrl文件的数据
	
	public DataExtracted(){
		
	}
	/**
	 * 指定所要获取的文件，并指定所要读取的标签名和所要读取的属性名
	 * @param folderPath 文件所在目录
	 * @param elements  所要读取的标签名
	 * @param attributes 所要读取的属性名
	 */
	public DataExtracted(String path,ArrayList<String> elements,ArrayList<String> attributes ){
		if(path!=null && !path.equals("")){
			File f = new File(path);
			files = f.listFiles();
		}
		
		if(elements !=null){
			this.elements = elements;
		}
		if(attributes != null){
			this.attributes = attributes;
		}
	}
	
	/**
	 * @param file
	 */
	public void readXBRL(String file){
		File f = new File(file);
		SAXReader reader = new SAXReader();
		try {
			Document doc = reader.read(f);
			Element root = doc.getRootElement();
			Element e = (Element) doc.selectObject("cn-fr-common:OwnersEquity");
	//		Element e = (Element) root.selectSingleNode("cn-fr-common:OwnersEquity");
			List<Element> list = (List<Element>) root.selectObject("cn-fr-common:OwnersEquity");
			
			System.out.println("=======");
			System.out.println(root.toString());
			System.out.println(e.attribute("contextRef").getStringValue()+"\t"+e.getStringValue());
			for(Element l : list){
				System.out.print(l.attribute("contextRef").getStringValue()+"\t"+l.getStringValue());
				System.out.println();
				
			}
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 读取xbrl文件中的数据，并保存到相应的类中
	 * 
	 * @param files 文件名列表
	 */
	public void readXBRL(){
		if(files==null) return; //所读取文件为空时返回
		
		SAXReader reader = new SAXReader();
		for(File file : files){
			try {
				Document doc = reader.read(file);
				Element root = doc.getRootElement();
				
				if(elements==null) return; //所读标签名称为空时停止
				for(String element : elements){
					List<Element> elts = (List<Element>) root.selectObject(element);
					for(Element elt : elts){
						//System.out.println(elt.getStringValue());
						
						if(attributes == null) return;
						for(String attribute : attributes){
							//System.out.println(elt.attribute(attribute).getStringValue());
						}
					}
				}
				
			} catch (DocumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	/**
	 * 从财务报表的文件名中获取财务报告的年份
	 * @param f
	 * @return
	 */
	private String yearOfReport(File f){
		String year = f.getName();
		
		return year;
	}
	
	public File[] getFiles() {
		return files;
	}
	public void setFiles(File[] files) {
		this.files = files;
	}

	public ArrayList<String> getElements() {
		return elements;
	}
	public void setElements(ArrayList<String> elements) {
		this.elements = elements;
	}
	
	public ArrayList<String> getAttributes() {
		return attributes;
	}
	public void setAttributes(ArrayList<String> attributes) {
		this.attributes = attributes;
	}
	public static void main(String[] args){
	}
}
