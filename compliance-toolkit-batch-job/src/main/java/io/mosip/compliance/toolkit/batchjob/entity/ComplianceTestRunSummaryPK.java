package io.mosip.compliance.toolkit.batchjob.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ComplianceTestRunSummaryPK implements Serializable {
	private static final long serialVersionUID = 1L;

	private String partnerId;

	private String projectId;

	private String collectionId;

}
