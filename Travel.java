package Serialazation;
 public class Travel implements Comparable<Travel> {

	private String packageId;
	private String packageSource;
	private String packageDestination;
	private int noOfdays;
	private double packageCost;
	
	@Override
	public String toString() {
		return "Travel [packageId=" + packageId + ", packageSource=" + packageSource + ", packageDestination="
				+ packageDestination + ", noOfdays=" + noOfdays + ", packageCost=" + packageCost + "]";
	}
	public String getPackageId() {
		return packageId;
	}
	
	public String getPackageSource() {
		return packageSource;
	}
	
	public String getPackageDestination() {
		return packageDestination;
	}
	
	public int getNoOfdays() {
		return noOfdays;
	}

	public double getPackageCost() {
		return packageCost;
	}
	
	/**
	 * @param packageId
	 * @param packageSource
	 * @param packageDestination
	 * @param noOfdays
	 * @param packageCost
	 */
	public Travel(String packageId, String packageSource, String packageDestination, int noOfdays, double packageCost) {
		super();
		this.packageId = packageId;
		this.packageSource = packageSource;
		this.packageDestination = packageDestination;
		this.noOfdays = noOfdays;
		this.packageCost = packageCost;
	}
	
	public int compareTo(Travel t) {
		if(this.packageCost<t.packageCost) {
			return 1;
		}
		return -1;
	}

}



