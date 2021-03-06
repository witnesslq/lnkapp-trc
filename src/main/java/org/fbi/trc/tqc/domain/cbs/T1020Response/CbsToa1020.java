package org.fbi.trc.tqc.domain.cbs.T1020Response;

import org.fbi.linking.codec.dataformat.annotation.DataField;
import org.fbi.linking.codec.dataformat.annotation.SeperatedTextMessage;

/**
 * Created by zhanrui on 14-10-20.
 */
@SeperatedTextMessage(separator = "\\|", mainClass = true)
public class CbsToa1020 {
    @DataField(seq = 1)
    private String acctNo;
    @DataField(seq = 2)
    private String rtnMsg;

    public String getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }

    public String getRtnMsg() {
        return rtnMsg;
    }

    public void setRtnMsg(String rtnMsg) {
        this.rtnMsg = rtnMsg;
    }

    @Override
    public String toString() {
        return "CbsToa1010{" +
                "acctNo='" + acctNo + '\'' +
                ", rtnMsg='" + rtnMsg + '\'' +
                '}';
    }
}
