/*
 * Author: Pawel Piesniewski
 * ID: A049473
 */
package enums;

public enum QueueName {

    DealerCTDIQueue("BALDO.TDI.DLR.IN"), OrganizationDistribution("BALDO.ORGANIZATION.DISTRIBUTION"),
    OrganizationDistributionT3("BALDO.ORGANIZATION.DISTRIBUTION_T3");

    private final String value;

    private QueueName(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
