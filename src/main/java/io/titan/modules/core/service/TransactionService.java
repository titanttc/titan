package io.titan.modules.core.service;

import java.util.List;

import com.alibaba.fastjson.JSONObject;

import io.titan.modules.core.entity.Blocks;
import io.titan.modules.core.entity.ChainInfo;
import io.titan.modules.core.entity.TokenInfo;
import io.titan.modules.core.entity.Transactions;

public interface TransactionService {

	Transactions processTransaction(String signedData);

	String getLastNonce(String address);

	Blocks generateBlock();

	Blocks findBlocksByBlockHash(String blockHash);

	Blocks findBlocksByBlockNumber(Long blockNumber);

	JSONObject buildSyncBlocksData(Long blockNumber);

	List<Transactions> findTransactionsByStatus(String status);

	List<Transactions> findTransactionsByBlockNumber(Long blockNumber);

	ChainInfo getInfo();

	JSONObject getBlockByNumber(Long blockNumber);

	JSONObject getBlockByHash(String blockHash);

	List<TokenInfo> findTokenInfoAll4Page(int page, int pageSize);

	TokenInfo findTokenInfoByContract(String contract);

}
