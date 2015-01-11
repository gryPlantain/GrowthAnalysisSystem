package evaluation.index;
/**
 * 
 * @author guanru
 * 
 *	此类主要定义本系统选取上市公司成长性指标
 */

public class GrowthIndex {
	private float scale;			//公司规模
	private float proSale;			//销售净利率
	private float ROE;		 		//净资产收益率
	private float ROTA;				//总资产收益率
	private float proGross; 		//毛利率
	private float EPS;				//每股收益
	private float currentRatio;	//流动比率
	private float quickRatio; 	//速动比率
	private float cashRatio;		//现金比率
	private float debtRatio; 		//资产负债率
	private float inventoryTurn;	//存货周转率
	private float receiveTurn;	//应收帐款周转率
	private float currentTurn;	//流动资产周转率
	private float totalTurn;		//总资产周转率
	private float costRate;		//成本费用率
	private float sellingCost; 	//销售费用率
	private float tatalGrowth;	//总资产增长率
	private float capitalAccumulation;//资本积累率
	private float businessRevenue;//营业收入增长率
	private float IntangibleRatio;//无形资产占比
	
	
	public float getScale() {
		return scale;
	}
	public void setScale(float scale) {
		this.scale = scale;
	}
	public float getProSale() {
		return proSale;
	}
	public void setProSale(float proSale) {
		this.proSale = proSale;
	}
	public float getROE() {
		return ROE;
	}
	public void setROE(float rOE) {
		ROE = rOE;
	}
	public float getROTA() {
		return ROTA;
	}
	public void setROTA(float rOTA) {
		ROTA = rOTA;
	}
	public float getProGross() {
		return proGross;
	}
	public void setProGross(float proGross) {
		this.proGross = proGross;
	}
	public float getEPS() {
		return EPS;
	}
	public void setEPS(float ePS) {
		EPS = ePS;
	}
	public float getCurrentRatio() {
		return currentRatio;
	}
	public void setCurrentRatio(float currentRatio) {
		this.currentRatio = currentRatio;
	}
	public float getQuickRatio() {
		return quickRatio;
	}
	public void setQuickRatio(float quickRatio) {
		this.quickRatio = quickRatio;
	}
	public float getCashRatio() {
		return cashRatio;
	}
	public void setCashRatio(float cashRatio) {
		this.cashRatio = cashRatio;
	}
	public float getDebtRatio() {
		return debtRatio;
	}
	public void setDebtRatio(float debtRatio) {
		this.debtRatio = debtRatio;
	}
	public float getInventoryTurn() {
		return inventoryTurn;
	}
	public void setInventoryTurn(float inventoryTurn) {
		this.inventoryTurn = inventoryTurn;
	}
	public float getReceiveTurn() {
		return receiveTurn;
	}
	public void setReceiveTurn(float receiveTurn) {
		this.receiveTurn = receiveTurn;
	}
	public float getCurrentTurn() {
		return currentTurn;
	}
	public void setCurrentTurn(float currentTurn) {
		this.currentTurn = currentTurn;
	}
	public float getTotalTurn() {
		return totalTurn;
	}
	public void setTotalTurn(float totalTurn) {
		this.totalTurn = totalTurn;
	}
	public float getCostRate() {
		return costRate;
	}
	public void setCostRate(float costRate) {
		this.costRate = costRate;
	}
	public float getSellingCost() {
		return sellingCost;
	}
	public void setSellingCost(float sellingCost) {
		this.sellingCost = sellingCost;
	}
	public float getTatalGrowth() {
		return tatalGrowth;
	}
	public void setTatalGrowth(float tatalGrowth) {
		this.tatalGrowth = tatalGrowth;
	}
	public float getCapitalAccumulation() {
		return capitalAccumulation;
	}
	public void setCapitalAccumulation(float capitalAccumulation) {
		this.capitalAccumulation = capitalAccumulation;
	}
	public float getBusinessRevenue() {
		return businessRevenue;
	}
	public void setBusinessRevenue(float businessRevenue) {
		this.businessRevenue = businessRevenue;
	}
	public float getIntangibleRatio() {
		return IntangibleRatio;
	}
	public void setIntangibleRatio(float intangibleRatio) {
		IntangibleRatio = intangibleRatio;
	}
	
}
