package com.codingapi.tx.datasource.relational.txc.rollback;


import com.codingapi.tx.datasource.relational.txc.parser.CommitInfo;

/**
 * @author jsy.
 *
 *  17/12/22.
 */
public interface TxcRollbackService {


    /**执行回滚
     * @param commitInfo info
     */
    void rollback(CommitInfo commitInfo);
}
