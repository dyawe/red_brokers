package com.turntabl.marketdata.dto.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class OrderBookDto {
    @JsonProperty("TICKER")
    private String ticker;

    @JsonProperty("SELL_LIMIT")
    private int sellLimit;
}
