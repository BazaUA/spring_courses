CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `pib` varchar(100) NOT NULL,
  `course` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

CREATE TABLE `teachers` (
  `teacherId` int(11) NOT NULL AUTO_INCREMENT,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `birth_date` date DEFAULT NULL,
  `cell_phone` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`teacherId`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
