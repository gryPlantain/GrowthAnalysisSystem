package evaluation.index;

public class IndexAid {
	private double begAssets; 			//期初资产总计（期初总资产）
	private double finAssets;			//期末资产总计（期末总资产）
	private double netProfit;			//净利润
	private double begDebt;				//期初总负债（期初负债合计）
	private double finDebt;				//期末总资产（期末负债合计）
	private double begOptIncome;		//上年营业收入
	private double finOptIncome;		//本年营业收入
	private double optCosts;			//营业成本
	private double earnPerShare;		//基本每股收益
	private double begCurAssets;		//期初流动资产
	private double finCurAssets;		//期末流动资产
	private double begCurDebt;			//期初流动负债
	private double finCurDebt;			//期末流动负债
	private double begInventory;		//期初存货；
	private double finIventory;		//期末存货
	private double moneyFunds;			//货币资金
	private double cashEquivalents;	//现金及等价物
	private double begReceivables;	//期初应收帐款
	private double finReceivables;	//期末应收帐款
	private double totalProfit;		//利润总额
	private double marketingExpenses;//销售费用	
	private double manageCosts;		//管理费用
	private double financialCosts;	//财务费用
//	private double mainBizIncome;	//主营业务收入
	private double begOwnersEquity;//期初所有者权益
	private double finOwnersEquity;//期末所有者权益
	private double intagibleAssets;	//无形资产
	
	private String securitiesCode; //公司证券代码
	
	public double getBegAssets() {
		return begAssets;
	}
	public void setBegAssets(double begAssets) {
		this.begAssets = begAssets;
	}
	public double getFinAssets() {
		return finAssets;
	}
	public void setFinAssets(double finAssets) {
		this.finAssets = finAssets;
	}
	public double getNetProfit() {
		return netProfit;
	}
	public void setNetProfit(double netProfit) {
		this.netProfit = netProfit;
	}
	
	
	public double getBegDebt() {
		return begDebt;
	}
	public void setBegDebt(double begDebt) {
		this.begDebt = begDebt;
	}
	public double getFinDebt() {
		return finDebt;
	}
	public void setFinDebt(double finDebt) {
		this.finDebt = finDebt;
	}
	public double getBegOptIncome() {
		return begOptIncome;
	}
	public void setBegOptIncome(double begOptIncome) {
		this.begOptIncome = begOptIncome;
	}
	public double getFinOptIncome() {
		return finOptIncome;
	}
	public void setFinOptIncome(double finOptIncome) {
		this.finOptIncome = finOptIncome;
	}
	public double getOptCosts() {
		return optCosts;
	}
	public void setOptCosts(double optCosts) {
		this.optCosts = optCosts;
	}
	
	public double getEarnPerShare() {
		return earnPerShare;
	}
	public void setEarnPerShare(double earnPerShare) {
		this.earnPerShare = earnPerShare;
	}
	public double getBegCurAssets() {
		return begCurAssets;
	}
	public void setBegCurAssets(double begCurAssets) {
		this.begCurAssets = begCurAssets;
	}
	public double getFinCurAssets() {
		return finCurAssets;
	}
	public void setFinCurAssets(double finCurAssets) {
		this.finCurAssets = finCurAssets;
	}
	public double getBegCurDebt() {
		return begCurDebt;
	}
	public void setBegCurDebt(double begCurDebt) {
		this.begCurDebt = begCurDebt;
	}
	public double getFinCurDebt() {
		return finCurDebt;
	}
	public void setFinCurDebt(double finCurDebt) {
		this.finCurDebt = finCurDebt;
	}
	public double getBegInventory() {
		return begInventory;
	}
	public void setBegInventory(double begInventory) {
		this.begInventory = begInventory;
	}
	public double getFinIventory() {
		return finIventory;
	}
	public void setFinIventory(double finIventory) {
		this.finIventory = finIventory;
	}
	public double getMoneyFunds() {
		return moneyFunds;
	}
	public void setMoneyFunds(double moneyFunds) {
		this.moneyFunds = moneyFunds;
	}

	public double getCashEquivalents() {
		return cashEquivalents;
	}
	public void setCashEquivalents(double cashEquivalents) {
		this.cashEquivalents = cashEquivalents;
	}
	public double getBegReceivables() {
		return begReceivables;
	}
	public void setBegReceivables(double begReceivables) {
		this.begReceivables = begReceivables;
	}
	public double getFinReceivables() {
		return finReceivables;
	}
	public void setFinReceivables(double finReceivables) {
		this.finReceivables = finReceivables;
	}
	public double getTotalProfit() {
		return totalProfit;
	}
	public void setTotalProfit(double totalProfit) {
		this.totalProfit = totalProfit;
	}
	
	public double getMarketingExpenses() {
		return marketingExpenses;
	}
	public void setMarketingExpenses(double marketingExpenses) {
		this.marketingExpenses = marketingExpenses;
	}
	public double getFinancialCosts() {
		return financialCosts;
	}
	public void setFinancialCosts(double financialCosts) {
		this.financialCosts = financialCosts;
	}
	public double getManageCosts() {
		return manageCosts;
	}
	public void setManageCosts(double manageCosts) {
		this.manageCosts = manageCosts;
	}
	
	public double getBegOwnersEquity() {
		return begOwnersEquity;
	}
	public void setBegOwnersEquity(double begOwnersEquity) {
		this.begOwnersEquity = begOwnersEquity;
	}
	public double getFinOwnersEquity() {
		return finOwnersEquity;
	}
	public void setFinOwnersEquity(double finOwnersEquity) {
		this.finOwnersEquity = finOwnersEquity;
	}
	public double getIntagibleAssets() {
		return intagibleAssets;
	}
	public void setIntagibleAssets(double intagibleAssets) {
		this.intagibleAssets = intagibleAssets;
	}
	public String getSecuritiesCode() {
		return securitiesCode;
	}
	public void setSecuritiesCode(String securitiesCode) {
		this.securitiesCode = securitiesCode;
	}
	
}
