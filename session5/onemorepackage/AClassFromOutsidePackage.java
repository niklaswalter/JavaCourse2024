package session5.onemorepackage;

import session5.packageaccessclasswithpublicmethods.APublicClass;

//import session5.packageaccessclasswithpublicmethods.PackageAccessClass;

public class AClassFromOutsidePackage {

	public static void main(String[] args) {

		APublicClass anObject = new APublicClass();
		anObject.aPublicMethod();
	}

}
