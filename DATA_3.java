package nineoct.PERIODIC_TABLE;

class DATA_3 {
    //2d array stores the informatin about periodic table

    protected static String ELEMENTS[][] = {
        
//         ELEMENTS[0][0] = "atomic number";
//         ELEMENTS[0][1] = "element name";
//         ELEMENTS[0][2] = "atomic mass";
//         ELEMENTS[0][3] = "melting point";
//         ELEMENTS[0][4] = "boiling point";
//         ELEMENTS[0][5] = "electronegativity";
//         ELEMENTS[0][6] = "group";
//         ELEMENTS[0][7] = "period";
//         ELEMENTS[0][8] = "electronic configuration";
//         ELEMENTS[0][9] = "metal or non-metal or metalloid";
    
        {"atomic number","element name","atomic mass","melting point","boiling point","electronegativity","group","period","electronic configuration","metal or non-metal or metalloid"},
        {"1","hydrogen","1.0078","-259.14","-252.87","2.20","1","1","1s1","non-metal"},
        {"2","helium","4.0026","-272.20","-268.93","N/A","18","1","1s2","non-metal"},
        {"3","lithium","6.941","180.54","1317","0.98","1","2","[He] 2s1","metal"},
        {"4","beryllium","9.0122","1287","2471","1.57","2","2","[He] 2s2","metal"},
        {"5","boron","10.811","2075","4000","2.04","13","2","[He] 2s2 2p1","metalloid"},
        {"6","carbon","12.0107","3550","4827","2.55","14","2","[He] 2s2 2p2","non-metal"},
        {"7","nitrogen","14.0067","-210.00","-195.80","3.04","15","2","[He] 2s2 2p3","non-metal"},
        {"8","oxygen","15.9994","-218.40","-182.96","3.44","16","2","[He] 2s2 2p4","non-metal"},
        {"9","fluorine","18.9984","-219.62","-188.12","3.98","17","2","[He] 2s2 2p5","non-metal"},
        {"10","neon","20.1797","-248.59","-246.08","N/A","18","2","[He] 2s2 2p6","non-metal"},
        {"11","sodium","22.9898","97.72","882.94","0.93","1","3","[Ne] 3s1","metal"},
        {"12","magnesium","24.305","650","1090","1.31","2","3","[Ne] 3s2","metal"},
        {"13","aluminium","26.9815","660.32","2519","1.61","13","3","[Ne] 3s2 3p1","metal"},
        {"14","silicon","28.0855","1414","3265","1.90","14","3","[Ne] 3s2 3p2","metalloid"},
        {"15","phosphorus","30.9738","44.15","280.5","2.19","15","3","[Ne] 3s2 3p3","non-metal"},
        {"16","sulfur","32.065","115.21","444.72","2.58","16","3","[Ne] 3s2 3p4","non-metal"},
        {"17","chlorine","35.453","-101.5","-34.04","3.16","17","3","[Ne] 3s2 3p5","non-metal"},
        {"18","argon","39.948","-189.35","-185.85","N/A","18","3","[Ne] 3s2 3p6","non-metal"},
        {"19","potassium","39.0983","63.38","759","0.82","1","4","[Ar] 4s1","metal"},
        {"20","calcium","40.078","842","1484","1.00","2","4","[Ar] 4s2","metal"},
        {"21","scandium","44.9559","1541","2836","1.36","3","4","[Ar] 3d1 4s2","metal"},
        {"22","titanium","47.867","1668","3287","1.54","4","4","[Ar] 3d2 4s2","metal"},
        {"23","vanadium","50.9415","1910","3407","1.63","5","4","[Ar] 4s2 3d3","transition metal"},
        {"24","chromium","51.9961","1907","2671","1.66","6","4","[Ar] 3d5 4s1","metal"},
        {"25","manganese","54.938","1246","2061","1.55","7","4","[Ar] 3d5 4s2","metal"},
        {"26","iron","55.845","1538","2862","1.83","8","4","[Ar] 3d6 4s2","metal"},
        {"27","cobalt","58.9332","1495","2927","1.88","9","4","[Ar] 3d7 4s2","metal"},
        {"28","nickel","58.6934","1455","2913","1.91","10","4","[Ar] 3d8 4s2","metal"},
        {"29","copper","63.546","1084.62","2562","1.90","11","4","[Ar] 3d10 4s1","metal"},
        {"30","zinc","65.38","419.53","907","1.65","12","4","[Ar] 3d10 4s2","metal"},
        {"31","gallium","69.723","29.76","2204","1.81","13","4","[Ar] 3d10 4s2 4p1","metal"},
        {"32","germanium","72.64","938.25","2820","2.01","14","4","[Ar] 3d10 4s2 4p2","metalloid"},
        {"33","arsenic","74.9216","817","614","2.18","15","4","[Ar] 3d10 4s2 4p3","metalloid"},
        {"34","selenium","78.96","221","685","2.55","16","4","[Ar] 3d10 4s2 4p4","non-metal"},
        {"35","bromine","79.904","-7.2","58.8","2.96","17","4","[Ar] 4s2 3d10 4p5","non-metal"},
        {"36","krypton","83.798","-157.36","-153.22","3.00","18","4","[Ar] 3d10 4s2 4p6","non-metal"},
        {"37","rubidium","85.4678","39.31","688","0.82","1","5","[Kr] 5s1","metal"},
        {"38","strontium","87.62","777","1382","0.95","2","5","[Kr] 5s2","metal"},
        {"39","yttrium","88.9059","1526","3336","1.22","3","5","[Kr] 4d1 5s2","metal"},
        {"40","zirconium","91.224","1855","4409","1.33","4","5","[Kr] 4d2 5s2","metal"},
        {"41","niobium","92.9064","2477","4744","1.6","5","5","[Kr] 4d4 5s1","metal"},
        {"42","molybdenum","95.94","2623","4639","2.16","6","5","[Kr] 4d5 5s1","metal"},
        {"43","technetium","(98)","2157","4265","1.9","7","5","[Kr] 4d5 5s2","metal"},
        {"44","ruthenium","101.07","2334","4150","2.2","8","5","[Kr] 4d7 5s1","metal"},
        {"45","rhodium","102.9055","1964","3695","2.28","9","5","[Kr] 4d8 5s1","metal"},
        {"46","palladium","106.42","1554.9","2963","2.20","10","5","[Kr] 4d10","metal"},
        {"47","silver","107.87","961.78","2162","1.93","11","5","[Kr] 5s2 4d9","metal"},
        {"48","cadmium","112.411","321.07","767","1.69","12","5","[Kr] 4d10 5s2","metal"},
        {"49","indium","114.818","156.6","2072","1.78","13","5","[Kr] 4d10 5s2 5p1","metal"},
        {"50","tin","118.71","231.93","2602","1.96","14","5","[Kr] 4d10 5s2 5p2","metal"},
        {"51","antimony","121.76","630.63","1587","2.05","15","5","[Kr] 4d10 5s2 5p3","metalloid"},
        {"52","tellurium","127.6","449.51","988","2.1","16","5","[Kr] 4d10 5s2 5p4","metalloid"},
        {"53","iodine","126.9045","113.7","184.35","2.66","17","5","[Kr] 4d10 5s2 5p5","non-metal"},
        {"54","xenon","131.293","-111.7","-108.12","2.6","18","5","[Kr] 4d10 5s2 5p6","non-metal"},
        {"55","caesium","132.9055","28.44","671","0.79","1","6","[Xe] 6s1","metal"},
        {"56","barium","137.327","727","1870","0.89","2","6","[Xe] 6s2","metal"},
        {"57","lanthanum","138.9055","920","3464","1.10","3","6","[Xe] 5d1 6s2","metal"},
        {"58","cerium","140.116","795","3257","1.12","N/A","6","[Xe] 4f1 5d1 6s2","metal"},
        {"59","praseodymium","140.91","935","3212","1.13","19","6","[Xe] 6s2 4f3","lanthanide"},
        {"60","neodymium","144.242","1010","3127","1.14","N/A","6","[Xe] 4f4 6s2","metal"},
        {"61","promethium","(145)","1100","3000","N/A","N/A","6","[Xe] 4f5 6s2","metal"},
        {"62","samarium","150.36","1072","1900","1.17","N/A","6","[Xe] 4f6 6s2","metal"},
        {"63","europium","151.964","822","1597","N/A","N/A","6","[Xe] 4f7 6s2","metal"},
        {"64","gadolinium","157.25","1312","3266","1.20","N/A","6","[Xe] 4f7 5d1 6s2","metal"},
        {"65","terbium","158.9253","1360","3041","N/A","N/A","6","[Xe] 4f9 6s2","metal"},
        {"66","dysprosium","162.5","1412","2567","1.22","N/A","6","[Xe] 4f10 6s2","metal"},
        {"67","holmium","164.9303","1470","2720","1.23","N/A","6","[Xe] 4f11 6s2","metal"},
        {"68","erbium","167.259","1522","2510","1.24","N/A","6","[Xe] 4f12 6s2","metal"},
        {"69","thulium","168.9342","1545","1950","1.25","N/A","6","[Xe] 4f13 6s2","metal"},
        {"70","ytterbium","173.04","824","1196","N/A","N/A","6","[Xe] 4f14 6s2","metal"},
        {"71","lutetium","174.967","1652","1652","1652","1652","1652","1652","1652"},
        {"72","hafnium","178.49","2150","5400","1.3","4","6","[Xe] 4f14 5d2 6s2","metal"},
        {"73","tantalum","180.9479","2996","5425","1.5","5","6","[Xe] 4f14 5d3 6s2","metal"},
        {"74","tungsten","183.84","3422","5555","2.36","6","6","[Xe] 4f14 5d4 6s2","metal"},
        {"75","rhenium","186.207","3186","5596","1.9","7","6","[Xe] 4f14 5d5 6s2","metal"},
        {"76","osmium","190.23","3033","5012","2.2","8","6","[Xe] 4f14 5d6 6s2","metal"},
        {"77","iridium","192.217","2466","4428","2.20","9","6","[Xe] 4f14 5d7 6s2","metal"},
        {"78","platinum","195.078","1768.3","3825","2.28","10","6","[Xe] 4f14 5d9 6s1","metal"},
        {"79","gold","196.9665","1064.18","2856","2.54","11","6","[Xe] 4f14 5d10 6s1","metal"},
        {"80","mercury","200.59","-38.83","356.73","2.00","12","6","[Xe] 4f14 5d10 6s2","metal"},
        {"81","thallium","204.3833","304","1473","1.62","13","6","[Xe] 4f14 5d10 6s2 6p1","metal"},
        {"82","lead","207.2","327.46","1749","2.33","14","6","[Xe] 4f14 5d10 6s2 6p2","metal"},
        {"83","bismuth","208.98","271.4","1564","2.02","15","6","[Xe] 6s2 4f14 5d10 6p3","metal"},
        {"84","polonium","(209)","254","962","2.0","16","6","[Xe] 4f14 5d10 6s2 6p4","metalloid"},
        {"85","astatine","(210)","302","337","2.2","17","6","[Xe] 4f14 5d10 6s2 6p5","non-metal"},
        {"86","radon","(222)","-71.15","-61.7","N/A","18","6","[Xe] 4f14 5d10 6s2 6p6","non-metal"},
        {"87","francium","(223)","27","677","0.7","1","7","[Rn] 7s1","metal"},
        {"88","radium","(226)","700","1737","0.9","2","7","[Rn] 7s2","metal"},
        {"89","actinium","(227)","1050","3200","1.1","3","7","[Rn] 6d1 7s2","metal"},
        {"90","thorium","232.0381","1750","4790","1.3","N/A","7","[Rn] 6d2 7s2","metal"},
        {"91","protactinium","231.0359","1568","4027","1.5","N/A","7","[Rn] 5f2 6d1 7s2","metal"},
        {"92","uranium","238.0289","1132","3818","1.38","N/A","7","[Rn] 5f3 6d1 7s2","metal"},
        {"93","neptunium","(237)","644","3902","1.36","N/A","7","[Rn] 5f4 6d1 7s2","metal"},
        {"94","plutonium","(244)","640","3230","1.28","N/A","7","7","7"},
        {"95","americium","(243)","994","2607","1.3","N/A","7","[Rn] 5f7 7s2","metal"},
        {"96","curium","(247)","1340","N/A","1.3","N/A","7","[Rn] 5f7 6d1 7s2","metal"},
        {"97","berkelium","(247)","986","N/A","1.3","N/A","7","[Rn] 5f9 7s2","metal"},
        {"98","californium","(251)","900","N/A","1.3","N/A","7","[Rn] 5f10 7s2","metal"},
        {"99","einsteinium","(252)","860","N/A","1.3","N/A","7","[Rn] 5f11 7s2","metal"},
        {"100","fermium","(257)","1527","N/A","1.3","N/A","7","[Rn] 5f12 7s2","metal"},
        {"101","mendelevium","(258)","N/A","N/A","1.3","N/A","7","[Rn] 5f13 7s2","metal"},
        {"102","nobelium","(259)","827","N/A","1.3","N/A","7","[Rn] 5f14 7s2","metal"},
        {"103","lawrencium","(262)","1627","N/A","N/A","3","7","[Rn] 5f14 7s2 7p1","metal"},
        {"104","rutherfordium","(267)","N/A","N/A","N/A","4","7","[Rn] 5f14 6d2 7s2","metal"},
        {"105","dubnium","268","Unknown","Unknown","Unknown","5","7","[Rn] 5f14 6d3 7s2","transition metal"},
        {"106","seaborgium","(271)","N/A","N/A","N/A","6","7","[Rn] 5f14 6d4 7s2","metal"},
        {"107","bohrium","(272)","N/A","N/A","N/A","7","7","[Rn] 5f14 6d5 7s2","metal"},
        {"108","hassium","(270)","N/A","N/A","N/A","8","7","[Rn] 5f14 6d6 7s2","metal"},
        {"109","meitnerium","(276)","N/A","N/A","N/A","9","7","[Rn] 5f14 6d7 7s2","metal"},
        {"110","darmstadtium","(281)","N/A","N/A","N/A","10","7","[Rn] 5f14 6d9 7s1","metal"},
        {"111","roentgenium","(280)","N/A","N/A","N/A","11","7","[Rn] 5f14 6d10 7s1","metal"},
        {"112","copernicium","(285)","N/A","N/A","N/A","12","7","[Rn] 5f14 6d10 7s2","metal"},
        {"113","nihonium","(284)","N/A","N/A","N/A","13","7","[Rn] 5f14 6d10 7s2 7p1","metal"},
        {"114","flerovium","(289)","N/A","N/A","N/A","14","7","[Rn] 5f14 6d10 7s2 7p2","metal"},
        {"115","moscovium","(288)","N/A","N/A","N/A","15","7","[Rn] 5f14 6d10 7s2 7p3","metal"},
        {"116","Livermorium","Unknown","Unknown","Unknown","Unknown","16","7","[Rn] 5f14 6d10 7s2 7p4","post-transition metal"},
        {"117","tennessine","(294)","N/A","N/A","N/A","17","7","[Rn] 5f14 6d10 7s2 7p5","metalloid"},
        {"118","oganesson","(294)","N/A","N/A","N/A","18","7","[Rn] 5f14 6d10 7s2 7p6","non-metal"} 

    };

}
