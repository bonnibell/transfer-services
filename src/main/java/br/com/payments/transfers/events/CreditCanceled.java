package br.com.payments.transfers.events;

import java.time.LocalDateTime;

import org.axonframework.modelling.command.TargetAggregateIdentifier;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CreditCanceled {

	@TargetAggregateIdentifier
	private final String transferId;
	private final double amount;
	private final String to;
	private final LocalDateTime at;

}

