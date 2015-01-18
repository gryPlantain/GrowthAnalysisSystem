package evaluaton.file;

import java.io.File;

import evaluation.index.IndexAid;
/**
 * XBRLFile类，用于处理xbrl文件名所包含的信息
 * @author guanru
 *
 */
public class XBRLFile {
	private String nation; //所属国家
	private String stockExchange; //所在交易所
	private String securitiesCode;//证券代码
	private String type;	//报告类型
	private String time;  //报告所属年份
	private String name; 	//文件名
	private File file;    //包含的文件
	public XBRLFile(){ }
	
	public XBRLFile(File file){
		this.file = file;
		this.name =file.getName();
		this.nation = name.substring(0,2);
		this.stockExchange = name.substring(3, 5);
		this.securitiesCode = name.substring(6, 12);
		this.type = name.substring(13, 19);
		this.time = name.substring(20, 24);
	}
	
	public IndexAid read(){
		IndexAid index = new IndexAid();
		
		
		
		
		return index;
	}
	
	public String getNation() {
		return nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	public void setStockExchange(String stockExchange) {
		this.stockExchange = stockExchange;
	}

	public String getSecuritiesCode() {
		return securitiesCode;
	}

	public void setSecuritiesCode(String securitiesCode) {
		this.securitiesCode = securitiesCode;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

}
