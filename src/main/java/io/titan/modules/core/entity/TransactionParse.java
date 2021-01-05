package io.titan.modules.core.entity;

public class TransactionParse {
	private String sender;
	private String receiveAddress;
	private String data;
	private String gasPrice;
	private String gasLimit;
	private String recoverPublicKey;
	private String recoverAddress;
	private String hash;
	private String nonce;
	private String value;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiveAddress() {
		return receiveAddress;
	}
	public void setReceiveAddress(String receiveAddress) {
		this.receiveAddress = receiveAddress;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getGasPrice() {
		return gasPrice;
	}
	public void setGasPrice(String gasPrice) {
		this.gasPrice = gasPrice;
	}
	public String getGasLimit() {
		return gasLimit;
	}
	public void setGasLimit(String gasLimit) {
		this.gasLimit = gasLimit;
	}
	public String getRecoverPublicKey() {
		return recoverPublicKey;
	}
	public void setRecoverPublicKey(String recoverPublicKey) {
		this.recoverPublicKey = recoverPublicKey;
	}
	public String getRecoverAddress() {
		return recoverAddress;
	}
	public void setRecoverAddress(String recoverAddress) {
		this.recoverAddress = recoverAddress;
	}
	public String getHash() {
		return hash;
	}
	public void setHash(String hash) {
		this.hash = hash;
	}
	public String getNonce() {
		return nonce;
	}
	public void setNonce(String nonce) {
		this.nonce = nonce;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	@Override
	public String toString() {
		return "TransactionParse [" + "hash=" + hash +
                "  nonce=" + nonce +
                ", gasPrice=" + gasPrice +
                ", gas=" + gasLimit +
                ", receiveAddress=" + receiveAddress +
                ", sender=" + sender  +
                ", value=" + value +
                ", data=" + data +
                ", recoverPublicKey=" + recoverPublicKey +
                ", recoverAddress=" + recoverAddress +
                "]";
	}
}

