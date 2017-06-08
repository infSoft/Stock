package PO;


import java.util.Date;

/**
 * StockCurrentData 实例对象
 */
public class StockCurrentData implements java.io.Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = -7026298068521632591L;
	//代码
	private String code;
	//名称
	private String name;
	//日期
	private Date date;
	//涨跌幅
	private Double changepercent;
	//现价
	private Double trade;
	//开盘价
	private Double open;
	//最高价
	private Double high;
	//最低价
	private Double low;
	//昨日收盘价
	private Double settlement;
	//成交量
	private Long volume;
	//换手率
	private Double turnoverratio;
	//成交额
	private Long amount;
	//市盈率
	private Double per;
	//市净率
	private Double pb;
	//总市值
	private Double mktcap;
	//流通市值
	private Double nmc;

	public StockCurrentData() {
	}

	public StockCurrentData(String code) {
		this.code = code;
	}

	public StockCurrentData(String code, String name, Date date, Double changepercent, Double trade,
			Double open, Double high, Double low, Double settlement, Long volume, Double turnoverratio, Long amount,
			Double per, Double pb, Double mktcap, Double nmc) {
		this.code = code;
		this.name = name;
		this.date = date;
		this.changepercent = changepercent;
		this.trade = trade;
		this.open = open;
		this.high = high;
		this.low = low;
		this.settlement = settlement;
		this.volume = volume;
		this.turnoverratio = turnoverratio;
		this.amount = amount;
		this.per = per;
		this.pb = pb;
		this.mktcap = mktcap;
		this.nmc = nmc;
	}


	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getChangepercent() {
		return this.changepercent;
	}

	public void setChangepercent(Double changepercent) {
		this.changepercent = changepercent;
	}

	public Double getTrade() {
		return this.trade;
	}

	public void setTrade(Double trade) {
		this.trade = trade;
	}

	public Double getOpen() {
		return this.open;
	}

	public void setOpen(Double open) {
		this.open = open;
	}

	public Double getHigh() {
		return this.high;
	}

	public void setHigh(Double high) {
		this.high = high;
	}

	public Double getLow() {
		return this.low;
	}

	public void setLow(Double low) {
		this.low = low;
	}

	public Double getSettlement() {
		return this.settlement;
	}

	public void setSettlement(Double settlement) {
		this.settlement = settlement;
	}

	public Long getVolume() {
		return this.volume;
	}

	public void setVolume(Long volume) {
		this.volume = volume;
	}

	public Double getTurnoverratio() {
		return this.turnoverratio;
	}

	public void setTurnoverratio(Double turnoverratio) {
		this.turnoverratio = turnoverratio;
	}

	public Long getAmount() {
		return this.amount;
	}

	public void setAmount(Long amount) {
		this.amount = amount;
	}

	public Double getPer() {
		return this.per;
	}

	public void setPer(Double per) {
		this.per = per;
	}

	public Double getPb() {
		return this.pb;
	}

	public void setPb(Double pb) {
		this.pb = pb;
	}

	public Double getMktcap() {
		return this.mktcap;
	}

	public void setMktcap(Double mktcap) {
		this.mktcap = mktcap;
	}

	public Double getNmc() {
		return this.nmc;
	}

	public void setNmc(Double nmc) {
		this.nmc = nmc;
	}

	@Override
	public String toString() {
		return "StockCurrentData [code=" + code + ", name=" + name + ", date=" + date
				+ ", changepercent=" + changepercent + ", trade=" + trade + ", open=" + open + ", high=" + high
				+ ", low=" + low + ", settlement=" + settlement + ", volume=" + volume + ", turnoverratio="
				+ turnoverratio + ", amount=" + amount + ", per=" + per + ", pb=" + pb + ", mktcap=" + mktcap + ", nmc="
				+ nmc + "]";
	}
	
}
