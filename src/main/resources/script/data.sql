CREATE TABLE `employee` (
  `EmpId` int(11) NOT NULL AUTO_INCREMENT,
  `Address1` varchar(255) DEFAULT NULL,
  `BaseLocation` varchar(255) DEFAULT NULL,
  `City` varchar(255) DEFAULT NULL,
  `Country` varchar(255) DEFAULT NULL,
  `DepartmentName` varchar(255) DEFAULT NULL,
  `Designation` varchar(255) DEFAULT NULL,
  `Email` varchar(255) DEFAULT NULL,
  `FirstName` varchar(255) DEFAULT NULL,
  `Gender` varchar(255) DEFAULT NULL,
  `LastName` varchar(255) DEFAULT NULL,
  `ContactNo` bigint(20) DEFAULT NULL,
  `NoOfExp` varchar(255) DEFAULT NULL,
  `OfficeCity` varchar(255) DEFAULT NULL,
  `Password` varchar(255) DEFAULT NULL,
  `Role` varchar(255) DEFAULT NULL,
  `Salary` varchar(255) DEFAULT NULL,
  `UserName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EmpId`)
) ENGINE=InnoDB AUTO_INCREMENT=1002 DEFAULT CHARSET=utf8;



CREATE TABLE `userdetails` (
  `Id` int(30) NOT NULL AUTO_INCREMENT,
  `CountryName` varchar(50) NOT NULL,
  `StateName` varchar(50) NOT NULL,
  `StatePopulation` int(100) DEFAULT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;





CREATE TABLE `stock_master` (
  `itemcode` int(11) NOT NULL AUTO_INCREMENT,
  `itemname` varchar(20) DEFAULT NULL,
  `stock` int(11) DEFAULT NULL,
  PRIMARY KEY (`itemcode`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;