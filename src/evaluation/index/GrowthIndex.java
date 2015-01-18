package evaluation.index;
/**
 * 
 * @author guanru
 * 
 *	此类主要定义本系统选取上市公司成长性指标
 */

public class GrowthIndex {
	private double scale;			//公司规模
	private double proSale;		//销售净利率
	private double ROE;		 		//净资产收益率
	private double ROTA;			//总资产收益率
	private double proGross; 		//毛利率
	private double EPS;				//每股收益
	private double currentRatio;	//流动比率
	private double quickRatio; 	//速动比率
	private double cashRatio;		//现金比率
	private double debtRatio; 		//资产负债率
	private double inventoryTurn;	//存货周转率
	private double receiveTurn;	//应收帐款周转率
	private double currentTurn;	//流动资产周转率
	private double totalTurn;		//总资产周转率
	private double costRate;		//成本费用率
	private double sellingCost; 	//销售费用率
	private double tatalGrowth;	//总资产增长率
	private double capitalAccumulation;//资本积累率
	private double businessRevenue;//营业收入增长率
	private double IntangibleRatio;//无形资产占比
	
	public GrowthIndex(){
		
	}
	public GrowthIndex(IndexAid index){
		init(index);
	}
	
	/**
	 * 初始化变量
	 * @param index
	 */
	private void init(IndexAid index){
		/*ln(总资产)*/
		this.scale = Math.log((index.getFinAssets()));
		
		/* 销售净利率=净利润（利润表） ÷ 营业收入 × 100% */
		this.proSale = index.getNetProfit()/index.getFinOptIncome();
		
		/*	净资产收益率=净利润 ÷ 平均净资产 × 100%
			平均净资产=(期初净资产+期末净资产) ÷ 2
			期初净资产=期初总资产 - 期初总负债
			期末净资产=期末总资产 - 期末总负责
		 */
		this.ROE = index.getNetProfit()/((index.getBegAssets()-index.getBegDebt()+
				index.getFinAssets()-index.getFinDebt())/2);
		
		/*　总资产收益率=净利润 ÷ 平均资产总额 × 100%
        	平均资产总额=(期初资产总额+期末资产总额) ÷ 2
		 */
		this.ROTA = index.getNetProfit()/((index.getBegAssets()+index.getFinAssets())/2);
		
		/*  毛利率=(营业收入-营业成本) ÷ 营业收入× 100%   */
		this.proGross = (index.getFinOptIncome()-index.getOptCosts())/index.getFinOptIncome();
		
		/*  每股收益=扣除非经常性损益的净利润 ÷ 流通在外的普通股股数  <=> 稀释每股收益 */
		this.EPS = index.getEarnPerShare();
		
		/*　流动比率=流动资产（合计） ÷ 流动负债（合计） × 100%  */
		this.currentRatio = index.getFinCurAssets()/index.getFinCurDebt();
		
		/*  速动比率=速动资产 ÷ 流动负债 × 100%
     		速动比率=(流动资产 － 存货) ÷ 流动负债 × 100%
		 */
		this.quickRatio = (index.getFinCurAssets()-index.getFinIventory())/index.getFinCurDebt();
		
		/*  现金比率=现金及等价物 ÷ 流动负债 × 100%
        	现金及等价物=货币资金+短期投资
         	短期投资 <=> 一年内到期的非流动资产
		 */
		this.cashRatio = (index.getMoneyFunds()+index.getCashEquivalents())/index.getFinCurDebt();
		
		/*　 资产负债率=负债总额 ÷ 资产总额 × 100% */
		this.debtRatio = index.getFinDebt()/index.getFinAssets();
		
		/* 存货周转率=营业成本 ÷ 平均存货 × 100%
           平均存货=(期初存货+期末存货) ÷ 2
        */
		this.inventoryTurn = index.getOptCosts()/((index.getBegInventory() + index.getFinIventory())/2);
		
		/* 应收账款周转率=营业收入 ÷ 平均应收账款 × 100%
           平均应收账款=(期初应收账款+期末应收账款) ÷ 2
        */
		this.receiveTurn = index.getFinOptIncome()/((index.getBegReceivables()+index.getFinReceivables())/2);
		
		/*　流动资产周转率=营业收入 ÷ 平均流动资产 × 100%
     		平均流动资产=(期初流动资产+期末流动资产) ÷ 2
		 */
		this.currentTurn = index.getFinOptIncome()/((index.getBegCurAssets()+index.getFinCurAssets())/2);
		
		/* 总资产周转率=销售收入 ÷ 平均总资产 × 100%
           销售收入<=>营业收入
			平均总资产=(期初总资产+期末总资产) ÷ 2
		 */
		this.totalTurn = index.getFinOptIncome()/((index.getBegAssets()+index.getFinAssets())/2);
		
		/* 成本费用率=利润总额÷(营业成本+销售费用+管理费用+财务费用) × 100% */
		this.costRate = index.getTotalProfit()/(index.getOptCosts()+index.getMarketingExpenses()+
				index.getManageCosts()+index.getFinancialCosts()); 
		
		/* 营销费用率=销售费用÷营业收入× 100% */
		this.sellingCost = index.getMarketingExpenses()/index.getFinOptIncome();
		
		/* 总资产增长率=(期末总资产 － 期初总资产)÷期初总资产 × 100% */
		this.tatalGrowth = (index.getFinAssets() - index.getBegAssets())/index.getBegAssets();
		
		/*  资本积累率=(期末股东权益－期初股东权益)÷期初股东权益 × 100%
 			股东权益 <=> 所有者权益（或股东权益）合计 
		 */
		this.capitalAccumulation = (index.getFinOwnersEquity()-index.getBegOwnersEquity())/index.getBegOwnersEquity();
		
		/* 　营业收入增长率=(营业收入增长额/上年营业收入总额)×100%
             营业收入增长额=营业收入总额-上年营业收入总额
         */
		this.businessRevenue = (index.getFinOptIncome() - index.getBegOptIncome())/index.getBegOptIncome();
		
		/* 无形资产占比=无形资产 ÷ 总资产 × 100%   */
		this.IntangibleRatio = index.getIntagibleAssets()/index.getFinAssets();
	}
	
	public double getScale() {
		return scale;
	}
	public void setScale(double scale) {
		this.scale = scale;
	}
	public double getProSale() {
		return proSale;
	}
	public void setProSale(double proSale) {
		this.proSale = proSale;
	}
	public double getROE() {
		return ROE;
	}
	public void setROE(double rOE) {
		ROE = rOE;
	}
	public double getROTA() {
		return ROTA;
	}
	public void setROTA(double rOTA) {
		ROTA = rOTA;
	}
	public double getProGross() {
		return proGross;
	}
	public void setProGross(double proGross) {
		this.proGross = proGross;
	}
	public double getEPS() {
		return EPS;
	}
	public void setEPS(double ePS) {
		EPS = ePS;
	}
	public double getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(double currentRatio) {
		this.currentRatio = currentRatio;
	}
	public double getQuickRatio() {
		return quickRatio;
	}
	public void setQuickRatio(double quickRatio) {
		this.quickRatio = quickRatio;
	}
	public double getCashRatio() {
		return cashRatio;
	}
	public void setCashRatio(double cashRatio) {
		this.cashRatio = cashRatio;
	}
	public double getDebtRatio() {
		return debtRatio;
	}
	public void setDebtRatio(double debtRatio) {
		this.debtRatio = debtRatio;
	}
	public double getInventoryTurn() {
		return inventoryTurn;
	}
	public void setInventoryTurn(double inventoryTurn) {
		this.inventoryTurn = inventoryTurn;
	}
	public double getReceiveTurn() {
		return receiveTurn;
	}
	public void setReceiveTurn(double receiveTurn) {
		this.receiveTurn = receiveTurn;
	}
	public double getCurrentTurn() {
		return currentTurn;
	}
	public void setCurrentTurn(double currentTurn) {
		this.currentTurn = currentTurn;
	}
	public double getTotalTurn() {
		return totalTurn;
	}
	public void setTotalTurn(double totalTurn) {
		this.totalTurn = totalTurn;
	}
	public double getCostRate() {
		return costRate;
	}
	public void setCostRate(double costRate) {
		this.costRate = costRate;
	}
	public double getSellingCost() {
		return sellingCost;
	}
	public void setSellingCost(double sellingCost) {
		this.sellingCost = sellingCost;
	}
	public double getTatalGrowth() {
		return tatalGrowth;
	}
	public void setTatalGrowth(double tatalGrowth) {
		this.tatalGrowth = tatalGrowth;
	}
	public double getCapitalAccumulation() {
		return capitalAccumulation;
	}
	public void setCapitalAccumulation(double capitalAccumulation) {
		this.capitalAccumulation = capitalAccumulation;
	}
	public double getBusinessRevenue() {
		return businessRevenue;
	}
	public void setBusinessRevenue(double businessRevenue) {
		this.businessRevenue = businessRevenue;
	}
	public double getIntangibleRatio() {
		return IntangibleRatio;
	}
	public void setIntangibleRatio(double intangibleRatio) {
		IntangibleRatio = intangibleRatio;
	}
	
}
