package com.cydeo.oopreview.model.pos;


import com.cydeo.oopreview.model.AbstractPosClientRequest;

import java.math.BigDecimal;

public class PosClientRequest extends AbstractPosClientRequest {
    public PosClientRequest(BigDecimal requestedAmount, String posClientClassName, String recipientName) {
        super(requestedAmount, posClientClassName, recipientName);
    }
}
