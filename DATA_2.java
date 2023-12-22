// package nineoct.PERIODIC_TABLE;



// import javax.swing.text.html.parser.Element;

// public class DATA_2{

//     String [][] ELEMENTS ;

//     DATA_2(){
//         ELEMENTS = new String[119][10];
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
        
//         ELEMENTS[1][0] = "1"; 
//         ELEMENTS[1][1] = "hydrogen"; 
//         ELEMENTS[1][2] = "1.0078"; 
//         ELEMENTS[1][3] = "-259.14"; // in Celsius
//         ELEMENTS[1][4] = "-252.87"; // in Celsius
//         ELEMENTS[1][5] = "2.20"; // Pauling scale
//         ELEMENTS[1][6] = "1"; // group number
//         ELEMENTS[1][7] = "1"; // period number
//         ELEMENTS[1][8] = "1s1"; // electronic configuration
//         ELEMENTS[1][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[2][0] = "2"; 
//         ELEMENTS[2][1] = "helium"; 
//         ELEMENTS[2][2] = "4.0026"; 
//         ELEMENTS[2][3] = "-272.20"; // in Celsius
//         ELEMENTS[2][4] = "-268.93"; // in Celsius
//         ELEMENTS[2][5] = "N/A"; // Pauling scale
//         ELEMENTS[2][6] = "18"; // group number
//         ELEMENTS[2][7] = "1"; // period number
//         ELEMENTS[2][8] = "1s2"; // electronic configuration
//         ELEMENTS[2][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[3][0] = "3"; 
//         ELEMENTS[3][1] = "lithium"; 
//         ELEMENTS[3][2] = "6.941"; 
//         ELEMENTS[3][3] = "180.54"; // in Celsius
//         ELEMENTS[3][4] = "1317"; // in Celsius
//         ELEMENTS[3][5] = "0.98"; // Pauling scale
//         ELEMENTS[3][6] = "1"; // group number
//         ELEMENTS[3][7] = "2"; // period number
//         ELEMENTS[3][8] = "[He] 2s1"; // electronic configuration
//         ELEMENTS[3][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[4][0] = "4"; 
//         ELEMENTS[4][1] = "beryllium"; 
//         ELEMENTS[4][2] = "9.0122"; 
//         ELEMENTS[4][3] = "1287"; // in Celsius
//         ELEMENTS[4][4] = "2471"; // in Celsius
//         ELEMENTS[4][5] = "1.57"; // Pauling scale
//         ELEMENTS[4][6] = "2"; // group number
//         ELEMENTS[4][7] = "2"; // period number
//         ELEMENTS[4][8] = "[He] 2s2"; // electronic configuration
//         ELEMENTS[4][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[5][0] = "5"; 
//         ELEMENTS[5][1] = "boron"; 
//         ELEMENTS[5][2] = "10.811"; 
//         ELEMENTS[5][3] = "2075"; // in Celsius
//         ELEMENTS[5][4] = "4000"; // in Celsius
//         ELEMENTS[5][5] = "2.04"; // Pauling scale
//         ELEMENTS[5][6] = "13"; // group number
//         ELEMENTS[5][7] = "2"; // period number
//         ELEMENTS[5][8] = "[He] 2s2 2p1"; // electronic configuration
//         ELEMENTS[5][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[6][0] = "6"; 
//         ELEMENTS[6][1] = "carbon"; 
//         ELEMENTS[6][2] = "12.0107"; 
//         ELEMENTS[6][3] = "3550"; // in Celsius
//         ELEMENTS[6][4] = "4827"; // in Celsius
//         ELEMENTS[6][5] = "2.55"; // Pauling scale
//         ELEMENTS[6][6] = "14"; // group number
//         ELEMENTS[6][7] = "2"; // period number
//         ELEMENTS[6][8] = "[He] 2s2 2p2"; // electronic configuration
//         ELEMENTS[6][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[7][0] = "7"; 
//         ELEMENTS[7][1] = "nitrogen"; 
//         ELEMENTS[7][2] = "14.0067"; 
//         ELEMENTS[7][3] = "-210.00"; // in Celsius
//         ELEMENTS[7][4] = "-195.80"; // in Celsius
//         ELEMENTS[7][5] = "3.04"; // Pauling scale
//         ELEMENTS[7][6] = "15"; // group number
//         ELEMENTS[7][7] = "2"; // period number
//         ELEMENTS[7][8] = "[He] 2s2 2p3"; // electronic configuration
//         ELEMENTS[7][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[8][0] = "8"; 
//         ELEMENTS[8][1] = "oxygen"; 
//         ELEMENTS[8][2] = "15.9994"; 
//         ELEMENTS[8][3] = "-218.40"; // in Celsius
//         ELEMENTS[8][4] = "-182.96"; // in Celsius
//         ELEMENTS[8][5] = "3.44"; // Pauling scale
//         ELEMENTS[8][6] = "16"; // group number
//         ELEMENTS[8][7] = "2"; // period number
//         ELEMENTS[8][8] = "[He] 2s2 2p4"; // electronic configuration
//         ELEMENTS[8][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[9][0] = "9"; 
//         ELEMENTS[9][1] = "fluorine"; 
//         ELEMENTS[9][2] = "18.9984"; 
//         ELEMENTS[9][3] = "-219.62"; // in Celsius
//         ELEMENTS[9][4] = "-188.12"; // in Celsius
//         ELEMENTS[9][5] = "3.98"; // Pauling scale
//         ELEMENTS[9][6] = "17"; // group number
//         ELEMENTS[9][7] = "2"; // period number
//         ELEMENTS[9][8] = "[He] 2s2 2p5"; // electronic configuration
//         ELEMENTS[9][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[10][0] = "10"; 
//         ELEMENTS[10][1] = "neon"; 
//         ELEMENTS[10][2] = "20.1797"; 
//         ELEMENTS[10][3] = "-248.59"; // in Celsius
//         ELEMENTS[10][4] = "-246.08"; // in Celsius
//         ELEMENTS[10][5] = "N/A"; // Pauling scale
//         ELEMENTS[10][6] = "18"; // group number
//         ELEMENTS[10][7] = "2"; // period number
//         ELEMENTS[10][8] = "[He] 2s2 2p6"; // electronic configuration
//         ELEMENTS[10][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[11][0] = "11";
//         ELEMENTS[11][1] = "sodium";
//         ELEMENTS[11][2] = "22.9898";
//         ELEMENTS[11][3] = "97.72";
//         ELEMENTS[11][4] = "882.94";
//         ELEMENTS[11][5] = "0.93";
//         ELEMENTS[11][6] = "1";
//         ELEMENTS[11][7] = "3";
//         ELEMENTS[11][8] = "[Ne] 3s1";
//         ELEMENTS[11][9] = "metal";

//         ELEMENTS[12][0] = "12"; 
//         ELEMENTS[12][1] = "magnesium"; 
//         ELEMENTS[12][2] = "24.305"; 
//         ELEMENTS[12][3] = "650"; // in Celsius
//         ELEMENTS[12][4] = "1090"; // in Celsius
//         ELEMENTS[12][5] = "1.31"; // Pauling scale
//         ELEMENTS[12][6] = "2"; // group number
//         ELEMENTS[12][7] = "3"; // period number
//         ELEMENTS[12][8] = "[Ne] 3s2"; // electronic configuration
//         ELEMENTS[12][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[13][0] = "13"; 
//         ELEMENTS[13][1] = "aluminium"; 
//         ELEMENTS[13][2] = "26.9815"; 
//         ELEMENTS[13][3] = "660.32"; // in Celsius
//         ELEMENTS[13][4] = "2519"; // in Celsius
//         ELEMENTS[13][5] = "1.61"; // Pauling scale
//         ELEMENTS[13][6] = "13"; // group number
//         ELEMENTS[13][7] = "3"; // period number
//         ELEMENTS[13][8] = "[Ne] 3s2 3p1"; // electronic configuration
//         ELEMENTS[13][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[14][0] = "14"; 
//         ELEMENTS[14][1] = "silicon"; 
//         ELEMENTS[14][2] = "28.0855"; 
//         ELEMENTS[14][3] = "1414"; // in Celsius
//         ELEMENTS[14][4] = "3265"; // in Celsius
//         ELEMENTS[14][5] = "1.90"; // Pauling scale
//         ELEMENTS[14][6] = "14"; // group number
//         ELEMENTS[14][7] = "3"; // period number
//         ELEMENTS[14][8] = "[Ne] 3s2 3p2"; // electronic configuration
//         ELEMENTS[14][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[15][0] = "15"; 
//         ELEMENTS[15][1] = "phosphorus"; 
//         ELEMENTS[15][2] = "30.9738"; 
//         ELEMENTS[15][3] = "44.15"; // in Celsius
//         ELEMENTS[15][4] = "280.5"; // in Celsius
//         ELEMENTS[15][5] = "2.19"; // Pauling scale
//         ELEMENTS[15][6] = "15"; // group number
//         ELEMENTS[15][7] = "3"; // period number
//         ELEMENTS[15][8] = "[Ne] 3s2 3p3"; // electronic configuration
//         ELEMENTS[15][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[16][0] = "16"; 
//         ELEMENTS[16][1] = "sulfur"; 
//         ELEMENTS[16][2] = "32.065"; 
//         ELEMENTS[16][3] = "115.21"; // in Celsius
//         ELEMENTS[16][4] = "444.72"; // in Celsius
//         ELEMENTS[16][5] = "2.58"; // Pauling scale
//         ELEMENTS[16][6] = "16"; // group number
//         ELEMENTS[16][7] = "3"; // period number
//         ELEMENTS[16][8] = "[Ne] 3s2 3p4"; // electronic configuration
//         ELEMENTS[16][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[17][0] = "17"; 
//         ELEMENTS[17][1] = "chlorine"; 
//         ELEMENTS[17][2] = "35.453"; 
//         ELEMENTS[17][3] = "-101.5"; // in Celsius
//         ELEMENTS[17][4] = "-34.04"; // in Celsius
//         ELEMENTS[17][5] = "3.16"; // Pauling scale
//         ELEMENTS[17][6] = "17"; // group number
//         ELEMENTS[17][7] = "3"; // period number
//         ELEMENTS[17][8] = "[Ne] 3s2 3p5"; // electronic configuration
//         ELEMENTS[17][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[18][0] = "18"; 
//         ELEMENTS[18][1] = "argon"; 
//         ELEMENTS[18][2] = "39.948"; 
//         ELEMENTS[18][3] = "-189.35"; // in Celsius
//         ELEMENTS[18][4] = "-185.85"; // in Celsius
//         ELEMENTS[18][5] = "N/A"; // Pauling scale
//         ELEMENTS[18][6] = "18"; // group number
//         ELEMENTS[18][7] = "3"; // period number
//         ELEMENTS[18][8] = "[Ne] 3s2 3p6"; // electronic configuration
//         ELEMENTS[18][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[19][0] = "19"; 
//         ELEMENTS[19][1] = "potassium"; 
//         ELEMENTS[19][2] = "39.0983"; 
//         ELEMENTS[19][3] = "63.38"; // in Celsius
//         ELEMENTS[19][4] = "759"; // in Celsius
//         ELEMENTS[19][5] = "0.82"; // Pauling scale
//         ELEMENTS[19][6] = "1"; // group number
//         ELEMENTS[19][7] = "4"; // period number
//         ELEMENTS[19][8] = "[Ar] 4s1"; // electronic configuration
//         ELEMENTS[19][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[20][0] = "20"; 
//         ELEMENTS[20][1] = "calcium"; 
//         ELEMENTS[20][2] = "40.078"; 
//         ELEMENTS[20][3] = "842"; // in Celsius
//         ELEMENTS[20][4] = "1484"; // in Celsius
//         ELEMENTS[20][5] = "1.00"; // Pauling scale
//         ELEMENTS[20][6] = "2"; // group number
//         ELEMENTS[20][7] = "4"; // period number
//         ELEMENTS[20][8] = "[Ar] 4s2"; // electronic configuration
//         ELEMENTS[20][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[21][0] = "21"; 
//         ELEMENTS[21][1] = "scandium"; 
//         ELEMENTS[21][2] = "44.9559"; 
//         ELEMENTS[21][3] = "1541"; // in Celsius
//         ELEMENTS[21][4] = "2836"; // in Celsius
//         ELEMENTS[21][5] = "1.36"; // Pauling scale
//         ELEMENTS[21][6] = "3"; // group number
//         ELEMENTS[21][7] = "4"; // period number
//         ELEMENTS[21][8] = "[Ar] 3d1 4s2"; // electronic configuration
//         ELEMENTS[21][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[22][0] = "22"; 
//         ELEMENTS[22][1] = "titanium"; 
//         ELEMENTS[22][2] = "47.867"; 
//         ELEMENTS[22][3] = "1668"; // in Celsius
//         ELEMENTS[22][4] = "3287"; // in Celsius
//         ELEMENTS[22][5] = "1.54"; // Pauling scale
//         ELEMENTS[22][6] = "4"; // group number
//         ELEMENTS[22][7] = "4"; // period number
//         ELEMENTS[22][8] = "[Ar] 3d2 4s2"; // electronic configuration
//         ELEMENTS[22][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[23][0] = "23";
//         ELEMENTS[23][1] = "vanadium";
//         ELEMENTS[23][2] = "50.9415";
//         ELEMENTS[23][3] = "1910";
//         ELEMENTS[23][4] = "3407";
//         ELEMENTS[23][5] = "1.63";
//         ELEMENTS[23][6] = "5";
//         ELEMENTS[23][7] = "4";
//         ELEMENTS[23][8] = "[Ar] 4s2 3d3";
//         ELEMENTS[23][9] = "transition metal";

//         ELEMENTS[24][0] = "24"; 
//         ELEMENTS[24][1] = "chromium"; 
//         ELEMENTS[24][2] = "51.9961"; 
//         ELEMENTS[24][3] = "1907"; // in Celsius
//         ELEMENTS[24][4] = "2671"; // in Celsius
//         ELEMENTS[24][5] = "1.66"; // Pauling scale
//         ELEMENTS[24][6] = "6"; // group number
//         ELEMENTS[24][7] = "4"; // period number
//         ELEMENTS[24][8] = "[Ar] 3d5 4s1"; // electronic configuration
//         ELEMENTS[24][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[25][0] = "25"; 
//         ELEMENTS[25][1] = "manganese"; 
//         ELEMENTS[25][2] = "54.938"; 
//         ELEMENTS[25][3] = "1246"; // in Celsius
//         ELEMENTS[25][4] = "2061"; // in Celsius
//         ELEMENTS[25][5] = "1.55"; // Pauling scale
//         ELEMENTS[25][6] = "7"; // group number
//         ELEMENTS[25][7] = "4"; // period number
//         ELEMENTS[25][8] = "[Ar] 3d5 4s2"; // electronic configuration
//         ELEMENTS[25][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[26][0] = "26"; 
//         ELEMENTS[26][1] = "iron"; 
//         ELEMENTS[26][2] = "55.845"; 
//         ELEMENTS[26][3] = "1538"; // in Celsius
//         ELEMENTS[26][4] = "2862"; // in Celsius
//         ELEMENTS[26][5] = "1.83"; // Pauling scale
//         ELEMENTS[26][6] = "8"; // group number
//         ELEMENTS[26][7] = "4"; // period number
//         ELEMENTS[26][8] = "[Ar] 3d6 4s2"; // electronic configuration
//         ELEMENTS[26][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[27][0] = "27"; 
//         ELEMENTS[27][1] = "cobalt"; 
//         ELEMENTS[27][2] = "58.9332"; 
//         ELEMENTS[27][3] = "1495"; // in Celsius
//         ELEMENTS[27][4] = "2927"; // in Celsius
//         ELEMENTS[27][5] = "1.88"; // Pauling scale
//         ELEMENTS[27][6] = "9"; // group number
//         ELEMENTS[27][7] = "4"; // period number
//         ELEMENTS[27][8] = "[Ar] 3d7 4s2"; // electronic configuration
//         ELEMENTS[27][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[28][0] = "28"; 
//         ELEMENTS[28][1] = "nickel"; 
//         ELEMENTS[28][2] = "58.6934"; 
//         ELEMENTS[28][3] = "1455"; // in Celsius
//         ELEMENTS[28][4] = "2913"; // in Celsius
//         ELEMENTS[28][5] = "1.91"; // Pauling scale
//         ELEMENTS[28][6] = "10"; // group number
//         ELEMENTS[28][7] = "4"; // period number
//         ELEMENTS[28][8] = "[Ar] 3d8 4s2"; // electronic configuration
//         ELEMENTS[28][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[29][0] = "29"; 
//         ELEMENTS[29][1] = "copper"; 
//         ELEMENTS[29][2] = "63.546"; 
//         ELEMENTS[29][3] = "1084.62"; // in Celsius
//         ELEMENTS[29][4] = "2562"; // in Celsius
//         ELEMENTS[29][5] = "1.90"; // Pauling scale
//         ELEMENTS[29][6] = "11"; // group number
//         ELEMENTS[29][7] = "4"; // period number
//         ELEMENTS[29][8] = "[Ar] 3d10 4s1"; // electronic configuration
//         ELEMENTS[29][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[30][0] = "30"; 
//         ELEMENTS[30][1] = "zinc"; 
//         ELEMENTS[30][2] = "65.38"; 
//         ELEMENTS[30][3] = "419.53"; // in Celsius
//         ELEMENTS[30][4] = "907"; // in Celsius
//         ELEMENTS[30][5] = "1.65"; // Pauling scale
//         ELEMENTS[30][6] = "12"; // group number
//         ELEMENTS[30][7] = "4"; // period number
//         ELEMENTS[30][8] = "[Ar] 3d10 4s2"; // electronic configuration
//         ELEMENTS[30][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[31][0] = "31"; 
//         ELEMENTS[31][1] = "gallium"; 
//         ELEMENTS[31][2] = "69.723"; 
//         ELEMENTS[31][3] = "29.76"; // in Celsius
//         ELEMENTS[31][4] = "2204"; // in Celsius
//         ELEMENTS[31][5] = "1.81"; // Pauling scale
//         ELEMENTS[31][6] = "13"; // group number
//         ELEMENTS[31][7] = "4"; // period number
//         ELEMENTS[31][8] = "[Ar] 3d10 4s2 4p1"; // electronic configuration
//         ELEMENTS[31][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[32][0] = "32"; 
//         ELEMENTS[32][1] = "germanium"; 
//         ELEMENTS[32][2] = "72.64"; 
//         ELEMENTS[32][3] = "938.25"; // in Celsius
//         ELEMENTS[32][4] = "2820"; // in Celsius
//         ELEMENTS[32][5] = "2.01"; // Pauling scale
//         ELEMENTS[32][6] = "14"; // group number
//         ELEMENTS[32][7] = "4"; // period number
//         ELEMENTS[32][8] = "[Ar] 3d10 4s2 4p2"; // electronic configuration
//         ELEMENTS[32][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[33][0] = "33"; 
//         ELEMENTS[33][1] = "arsenic"; 
//         ELEMENTS[33][2] = "74.9216"; 
//         ELEMENTS[33][3] = "817"; // in Celsius
//         ELEMENTS[33][4] = "614"; // in Celsius
//         ELEMENTS[33][5] = "2.18"; // Pauling scale
//         ELEMENTS[33][6] = "15"; // group number
//         ELEMENTS[33][7] = "4"; // period number
//         ELEMENTS[33][8] = "[Ar] 3d10 4s2 4p3"; // electronic configuration
//         ELEMENTS[33][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[34][0] = "34"; 
//         ELEMENTS[34][1] = "selenium"; 
//         ELEMENTS[34][2] = "78.96"; 
//         ELEMENTS[34][3] = "221"; // in Celsius
//         ELEMENTS[34][4] = "685"; // in Celsius
//         ELEMENTS[34][5] = "2.55"; // Pauling scale
//         ELEMENTS[34][6] = "16"; // group number
//         ELEMENTS[34][7] = "4"; // period number
//         ELEMENTS[34][8] = "[Ar] 3d10 4s2 4p4"; // electronic configuration
//         ELEMENTS[34][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[35][0] = "35";
//         ELEMENTS[35][1] = "bromine";
//         ELEMENTS[35][2] = "79.904";
//         ELEMENTS[35][3] = "-7.2";
//         ELEMENTS[35][4] = "58.8";
//         ELEMENTS[35][5] = "2.96";
//         ELEMENTS[35][6] = "17";
//         ELEMENTS[35][7] = "4";
//         ELEMENTS[35][8] = "[Ar] 4s2 3d10 4p5";
//         ELEMENTS[35][9] = "non-metal";

//         ELEMENTS[36][0] = "36"; 
//         ELEMENTS[36][1] = "krypton"; 
//         ELEMENTS[36][2] = "83.798"; 
//         ELEMENTS[36][3] = "-157.36"; // in Celsius
//         ELEMENTS[36][4] = "-153.22"; // in Celsius
//         ELEMENTS[36][5] = "3.00"; // Pauling scale
//         ELEMENTS[36][6] = "18"; // group number
//         ELEMENTS[36][7] = "4"; // period number
//         ELEMENTS[36][8] = "[Ar] 3d10 4s2 4p6"; // electronic configuration
//         ELEMENTS[36][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[37][0] = "37"; 
//         ELEMENTS[37][1] = "rubidium"; 
//         ELEMENTS[37][2] = "85.4678"; 
//         ELEMENTS[37][3] = "39.31"; // in Celsius
//         ELEMENTS[37][4] = "688"; // in Celsius
//         ELEMENTS[37][5] = "0.82"; // Pauling scale
//         ELEMENTS[37][6] = "1"; // group number
//         ELEMENTS[37][7] = "5"; // period number
//         ELEMENTS[37][8] = "[Kr] 5s1"; // electronic configuration
//         ELEMENTS[37][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[38][0] = "38"; 
//         ELEMENTS[38][1] = "strontium"; 
//         ELEMENTS[38][2] = "87.62"; 
//         ELEMENTS[38][3] = "777"; // in Celsius
//         ELEMENTS[38][4] = "1382"; // in Celsius
//         ELEMENTS[38][5] = "0.95"; // Pauling scale
//         ELEMENTS[38][6] = "2"; // group number
//         ELEMENTS[38][7] = "5"; // period number
//         ELEMENTS[38][8] = "[Kr] 5s2"; // electronic configuration
//         ELEMENTS[38][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[39][0] = "39"; 
//         ELEMENTS[39][1] = "yttrium"; 
//         ELEMENTS[39][2] = "88.9059"; 
//         ELEMENTS[39][3] = "1526"; // in Celsius
//         ELEMENTS[39][4] = "3336"; // in Celsius
//         ELEMENTS[39][5] = "1.22"; // Pauling scale
//         ELEMENTS[39][6] = "3"; // group number
//         ELEMENTS[39][7] = "5"; // period number
//         ELEMENTS[39][8] = "[Kr] 4d1 5s2"; // electronic configuration
//         ELEMENTS[39][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[40][0] = "40"; 
//         ELEMENTS[40][1] = "zirconium"; 
//         ELEMENTS[40][2] = "91.224"; 
//         ELEMENTS[40][3] = "1855"; // in Celsius
//         ELEMENTS[40][4] = "4409"; // in Celsius
//         ELEMENTS[40][5] = "1.33"; // Pauling scale
//         ELEMENTS[40][6] = "4"; // group number
//         ELEMENTS[40][7] = "5"; // period number
//         ELEMENTS[40][8] = "[Kr] 4d2 5s2"; // electronic configuration
//         ELEMENTS[40][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[41][0] = "41"; 
//         ELEMENTS[41][1] = "niobium"; 
//         ELEMENTS[41][2] = "92.9064"; 
//         ELEMENTS[41][3] = "2477"; // in Celsius
//         ELEMENTS[41][4] = "4744"; // in Celsius
//         ELEMENTS[41][5] = "1.6"; // Pauling scale
//         ELEMENTS[41][6] = "5"; // group number
//         ELEMENTS[41][7] = "5"; // period number
//         ELEMENTS[41][8] = "[Kr] 4d4 5s1"; // electronic configuration
//         ELEMENTS[41][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[42][0] = "42"; 
//         ELEMENTS[42][1] = "molybdenum"; 
//         ELEMENTS[42][2] = "95.94"; 
//         ELEMENTS[42][3] = "2623"; // in Celsius
//         ELEMENTS[42][4] = "4639"; // in Celsius
//         ELEMENTS[42][5] = "2.16"; // Pauling scale
//         ELEMENTS[42][6] = "6"; // group number
//         ELEMENTS[42][7] = "5"; // period number
//         ELEMENTS[42][8] = "[Kr] 4d5 5s1"; // electronic configuration
//         ELEMENTS[42][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[43][0] = "43"; 
//         ELEMENTS[43][1] = "technetium"; 
//         ELEMENTS[43][2] = "(98)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[43][3] = "2157"; // in Celsius
//         ELEMENTS[43][4] = "4265"; // in Celsius
//         ELEMENTS[43][5] = "1.9"; // Pauling scale
//         ELEMENTS[43][6] = "7"; // group number
//         ELEMENTS[43][7] = "5"; // period number
//         ELEMENTS[43][8] = "[Kr] 4d5 5s2"; // electronic configuration
//         ELEMENTS[43][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[44][0] = "44"; 
//         ELEMENTS[44][1] = "ruthenium"; 
//         ELEMENTS[44][2] = "101.07"; 
//         ELEMENTS[44][3] = "2334"; // in Celsius
//         ELEMENTS[44][4] = "4150"; // in Celsius
//         ELEMENTS[44][5] = "2.2"; // Pauling scale
//         ELEMENTS[44][6] = "8"; // group number
//         ELEMENTS[44][7] = "5"; // period number
//         ELEMENTS[44][8] = "[Kr] 4d7 5s1"; // electronic configuration
//         ELEMENTS[44][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[45][0] = "45"; 
//         ELEMENTS[45][1] = "rhodium"; 
//         ELEMENTS[45][2] = "102.9055"; 
//         ELEMENTS[45][3] = "1964"; // in Celsius
//         ELEMENTS[45][4] = "3695"; // in Celsius
//         ELEMENTS[45][5] = "2.28"; // Pauling scale
//         ELEMENTS[45][6] = "9"; // group number
//         ELEMENTS[45][7] = "5"; // period number
//         ELEMENTS[45][8] = "[Kr] 4d8 5s1"; // electronic configuration
//         ELEMENTS[45][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[46][0] = "46"; 
//         ELEMENTS[46][1] = "palladium"; 
//         ELEMENTS[46][2] = "106.42"; 
//         ELEMENTS[46][3] = "1554.9"; // in Celsius
//         ELEMENTS[46][4] = "2963"; // in Celsius
//         ELEMENTS[46][5] = "2.20"; // Pauling scale
//         ELEMENTS[46][6] = "10"; // group number
//         ELEMENTS[46][7] = "5"; // period number
//         ELEMENTS[46][8] = "[Kr] 4d10"; // electronic configuration
//         ELEMENTS[46][9] = "metal"; // metal or non-metal or metalloid

//         ELEMENTS[47][0] = "47";
//         ELEMENTS[47][1] = "silver";
//         ELEMENTS[47][2] = "107.87";
//         ELEMENTS[47][3] = "961.78";
//         ELEMENTS[47][4] = "2162";
//         ELEMENTS[47][5] = "1.93";
//         ELEMENTS[47][6] = "11";
//         ELEMENTS[47][7] = "5";
//         ELEMENTS[47][8] = "[Kr] 5s2 4d9";
//         ELEMENTS[47][9] = "metal";


//         ELEMENTS[48][0] = "48"; 
//         ELEMENTS[48][1] = "cadmium"; 
//         ELEMENTS[48][2] = "112.411"; 
//         ELEMENTS[48][3] = "321.07"; // in Celsius
//         ELEMENTS[48][4] = "767"; // in Celsius
//         ELEMENTS[48][5] = "1.69"; // Pauling scale
//         ELEMENTS[48][6] = "12"; // group number
//         ELEMENTS[48][7] = "5"; // period number
//         ELEMENTS[48][8] = "[Kr] 4d10 5s2"; // electronic configuration
//         ELEMENTS[48][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[49][0] = "49"; 
//         ELEMENTS[49][1] = "indium"; 
//         ELEMENTS[49][2] = "114.818"; 
//         ELEMENTS[49][3] = "156.6"; // in Celsius
//         ELEMENTS[49][4] = "2072"; // in Celsius
//         ELEMENTS[49][5] = "1.78"; // Pauling scale
//         ELEMENTS[49][6] = "13"; // group number
//         ELEMENTS[49][7] = "5"; // period number
//         ELEMENTS[49][8] = "[Kr] 4d10 5s2 5p1"; // electronic configuration
//         ELEMENTS[49][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[50][0] = "50"; 
//         ELEMENTS[50][1] = "tin"; 
//         ELEMENTS[50][2] = "118.71"; 
//         ELEMENTS[50][3] = "231.93"; // in Celsius
//         ELEMENTS[50][4] = "2602"; // in Celsius
//         ELEMENTS[50][5] = "1.96"; // Pauling scale
//         ELEMENTS[50][6] = "14"; // group number
//         ELEMENTS[50][7] = "5"; // period number
//         ELEMENTS[50][8] = "[Kr] 4d10 5s2 5p2"; // electronic configuration
//         ELEMENTS[50][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[51][0] = "51"; 
//         ELEMENTS[51][1] = "antimony"; 
//         ELEMENTS[51][2] = "121.76"; 
//         ELEMENTS[51][3] = "630.63"; // in Celsius
//         ELEMENTS[51][4] = "1587"; // in Celsius
//         ELEMENTS[51][5] = "2.05"; // Pauling scale
//         ELEMENTS[51][6] = "15"; // group number
//         ELEMENTS[51][7] = "5"; // period number
//         ELEMENTS[51][8] = "[Kr] 4d10 5s2 5p3"; // electronic configuration
//         ELEMENTS[51][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[52][0] = "52"; 
//         ELEMENTS[52][1] = "tellurium"; 
//         ELEMENTS[52][2] = "127.6"; 
//         ELEMENTS[52][3] = "449.51"; // in Celsius
//         ELEMENTS[52][4] = "988"; // in Celsius
//         ELEMENTS[52][5] = "2.1"; // Pauling scale
//         ELEMENTS[52][6] = "16"; // group number
//         ELEMENTS[52][7] = "5"; // period number
//         ELEMENTS[52][8] = "[Kr] 4d10 5s2 5p4"; // electronic configuration
//         ELEMENTS[52][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[53][0] = "53"; 
//         ELEMENTS[53][1] = "iodine"; 
//         ELEMENTS[53][2] = "126.9045"; 
//         ELEMENTS[53][3] = "113.7"; // in Celsius
//         ELEMENTS[53][4] = "184.35"; // in Celsius
//         ELEMENTS[53][5] = "2.66"; // Pauling scale
//         ELEMENTS[53][6] = "17"; // group number
//         ELEMENTS[53][7] = "5"; // period number
//         ELEMENTS[53][8] = "[Kr] 4d10 5s2 5p5"; // electronic configuration
//         ELEMENTS[53][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[54][0] = "54"; 
//         ELEMENTS[54][1] = "xenon"; 
//         ELEMENTS[54][2] = "131.293"; 
//         ELEMENTS[54][3] = "-111.7"; // in Celsius
//         ELEMENTS[54][4] = "-108.12"; // in Celsius
//         ELEMENTS[54][5] = "2.6"; // Pauling scale
//         ELEMENTS[54][6] = "18"; // group number
//         ELEMENTS[54][7] = "5"; // period number
//         ELEMENTS[54][8] = "[Kr] 4d10 5s2 5p6"; // electronic configuration
//         ELEMENTS[54][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[55][0] = "55"; 
//         ELEMENTS[55][1] = "caesium"; 
//         ELEMENTS[55][2] = "132.9055"; 
//         ELEMENTS[55][3] = "28.44"; // in Celsius
//         ELEMENTS[55][4] = "671"; // in Celsius
//         ELEMENTS[55][5] = "0.79"; // Pauling scale
//         ELEMENTS[55][6] = "1"; // group number
//         ELEMENTS[55][7] = "6"; // period number
//         ELEMENTS[55][8] = "[Xe] 6s1"; // electronic configuration
//         ELEMENTS[55][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[56][0] = "56"; 
//         ELEMENTS[56][1] = "barium"; 
//         ELEMENTS[56][2] = "137.327"; 
//         ELEMENTS[56][3] = "727"; // in Celsius
//         ELEMENTS[56][4] = "1870"; // in Celsius
//         ELEMENTS[56][5] = "0.89"; // Pauling scale
//         ELEMENTS[56][6] = "2"; // group number
//         ELEMENTS[56][7] = "6"; // period number
//         ELEMENTS[56][8] = "[Xe] 6s2"; // electronic configuration
//         ELEMENTS[56][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[57][0] = "57"; 
//         ELEMENTS[57][1] = "lanthanum"; 
//         ELEMENTS[57][2] = "138.9055"; 
//         ELEMENTS[57][3] = "920"; // in Celsius
//         ELEMENTS[57][4] = "3464"; // in Celsius
//         ELEMENTS[57][5] = "1.10"; // Pauling scale
//         ELEMENTS[57][6] = "3"; // group number
//         ELEMENTS[57][7] = "6"; // period number
//         ELEMENTS[57][8] = "[Xe] 5d1 6s2"; // electronic configuration
//         ELEMENTS[57][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[58][0] = "58"; 
//         ELEMENTS[58][1] = "cerium"; 
//         ELEMENTS[58][2] = "140.116"; 
//         ELEMENTS[58][3] = "795"; // in Celsius
//         ELEMENTS[58][4] = "3257"; // in Celsius
//         ELEMENTS[58][5] = "1.12"; // Pauling scale
//         ELEMENTS[58][6] = "N/A"; // group number
//         ELEMENTS[58][7] = "6"; // period number
//         ELEMENTS[58][8] = "[Xe] 4f1 5d1 6s2"; // electronic configuration
//         ELEMENTS[58][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[59][0] = "59";
//         ELEMENTS[59][1] = "praseodymium";
//         ELEMENTS[59][2] = "140.91";
//         ELEMENTS[59][3] = "935";
//         ELEMENTS[59][4] = "3212";
//         ELEMENTS[59][5] = "1.13";
//         ELEMENTS[59][6] = "19";
//         ELEMENTS[59][7] = "6";
//         ELEMENTS[59][8] = "[Xe] 6s2 4f3";
//         ELEMENTS[59][9] = "lanthanide";


//         ELEMENTS[60][0] = "60"; 
//         ELEMENTS[60][1] = "neodymium"; 
//         ELEMENTS[60][2] = "144.242"; 
//         ELEMENTS[60][3] = "1010"; // in Celsius
//         ELEMENTS[60][4] = "3127"; // in Celsius
//         ELEMENTS[60][5] = "1.14"; // Pauling scale
//         ELEMENTS[60][6] = "N/A"; // group number
//         ELEMENTS[60][7] = "6"; // period number
//         ELEMENTS[60][8] = "[Xe] 4f4 6s2"; // electronic configuration
//         ELEMENTS[60][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[61][0] = "61"; 
//         ELEMENTS[61][1] = "promethium"; 
//         ELEMENTS[61][2] = "(145)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[61][3] = "1100"; // in Celsius
//         ELEMENTS[61][4] = "3000"; // in Celsius
//         ELEMENTS[61][5] = "N/A"; // Pauling scale
//         ELEMENTS[61][6] = "N/A"; // group number
//         ELEMENTS[61][7] = "6"; // period number
//         ELEMENTS[61][8] = "[Xe] 4f5 6s2"; // electronic configuration
//         ELEMENTS[61][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[62][0] = "62"; 
//         ELEMENTS[62][1] = "samarium"; 
//         ELEMENTS[62][2] = "150.36"; 
//         ELEMENTS[62][3] = "1072"; // in Celsius
//         ELEMENTS[62][4] = "1900"; // in Celsius
//         ELEMENTS[62][5] = "1.17"; // Pauling scale
//         ELEMENTS[62][6] = "N/A"; // group number
//         ELEMENTS[62][7] = "6"; // period number
//         ELEMENTS[62][8] = "[Xe] 4f6 6s2"; // electronic configuration
//         ELEMENTS[62][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[63][0] = "63"; 
//         ELEMENTS[63][1] = "europium"; 
//         ELEMENTS[63][2] = "151.964"; 
//         ELEMENTS[63][3] = "822"; // in Celsius
//         ELEMENTS[63][4] = "1597"; // in Celsius
//         ELEMENTS[63][5] = "N/A"; // Pauling scale
//         ELEMENTS[63][6] = "N/A"; // group number
//         ELEMENTS[63][7] = "6"; // period number
//         ELEMENTS[63][8] = "[Xe] 4f7 6s2"; // electronic configuration
//         ELEMENTS[63][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[64][0] = "64"; 
//         ELEMENTS[64][1] = "gadolinium"; 
//         ELEMENTS[64][2] = "157.25"; 
//         ELEMENTS[64][3] = "1312"; // in Celsius
//         ELEMENTS[64][4] = "3266"; // in Celsius
//         ELEMENTS[64][5] = "1.20"; // Pauling scale
//         ELEMENTS[64][6] = "N/A"; // group number
//         ELEMENTS[64][7] = "6"; // period number
//         ELEMENTS[64][8] = "[Xe] 4f7 5d1 6s2"; // electronic configuration
//         ELEMENTS[64][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[65][0] = "65"; 
//         ELEMENTS[65][1] = "terbium"; 
//         ELEMENTS[65][2] = "158.9253"; 
//         ELEMENTS[65][3] = "1360"; // in Celsius
//         ELEMENTS[65][4] = "3041"; // in Celsius
//         ELEMENTS[65][5] = "N/A"; // Pauling scale
//         ELEMENTS[65][6] = "N/A"; // group number
//         ELEMENTS[65][7] = "6"; // period number
//         ELEMENTS[65][8] = "[Xe] 4f9 6s2"; // electronic configuration
//         ELEMENTS[65][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[66][0] = "66"; 
//         ELEMENTS[66][1] = "dysprosium"; 
//         ELEMENTS[66][2] = "162.5"; 
//         ELEMENTS[66][3] = "1412"; // in Celsius
//         ELEMENTS[66][4] = "2567"; // in Celsius
//         ELEMENTS[66][5] = "1.22"; // Pauling scale
//         ELEMENTS[66][6] = "N/A"; // group number
//         ELEMENTS[66][7] = "6"; // period number
//         ELEMENTS[66][8] = "[Xe] 4f10 6s2"; // electronic configuration
//         ELEMENTS[66][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[67][0] = "67"; 
//         ELEMENTS[67][1] = "holmium"; 
//         ELEMENTS[67][2] = "164.9303"; 
//         ELEMENTS[67][3] = "1470"; // in Celsius
//         ELEMENTS[67][4] = "2720"; // in Celsius
//         ELEMENTS[67][5] = "1.23"; // Pauling scale
//         ELEMENTS[67][6] = "N/A"; // group number
//         ELEMENTS[67][7] = "6"; // period number
//         ELEMENTS[67][8] = "[Xe] 4f11 6s2"; // electronic configuration
//         ELEMENTS[67][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[68][0] = "68"; 
//         ELEMENTS[68][1] = "erbium"; 
//         ELEMENTS[68][2] = "167.259"; 
//         ELEMENTS[68][3] = "1522"; // in Celsius
//         ELEMENTS[68][4] = "2510"; // in Celsius
//         ELEMENTS[68][5] = "1.24"; // Pauling scale
//         ELEMENTS[68][6] = "N/A"; // group number
//         ELEMENTS[68][7] = "6"; // period number
//         ELEMENTS[68][8] = "[Xe] 4f12 6s2"; // electronic configuration
//         ELEMENTS[68][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[69][0] = "69"; 
//         ELEMENTS[69][1] = "thulium"; 
//         ELEMENTS[69][2] = "168.9342"; 
//         ELEMENTS[69][3] = "1545"; // in Celsius
//         ELEMENTS[69][4] = "1950"; // in Celsius
//         ELEMENTS[69][5] = "1.25"; // Pauling scale
//         ELEMENTS[69][6] = "N/A"; // group number
//         ELEMENTS[69][7] = "6"; // period number
//         ELEMENTS[69][8] = "[Xe] 4f13 6s2"; // electronic configuration
//         ELEMENTS[69][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[70][0] = "70"; 
//         ELEMENTS[70][1] = "ytterbium"; 
//         ELEMENTS[70][2] = "173.04"; 
//         ELEMENTS[70][3] = "824"; // in Celsius
//         ELEMENTS[70][4] = "1196"; // in Celsius
//         ELEMENTS[70][5] = "N/A"; // Pauling scale
//         ELEMENTS[70][6] = "N/A"; // group number
//         ELEMENTS[70][7] = "6"; // period number
//         ELEMENTS[70][8] = "[Xe] 4f14 6s2"; // electronic configuration
//         ELEMENTS[70][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[71][0] = "71"; 
//         ELEMENTS[71][1] = "lutetium"; 
//         ELEMENTS[71][2] = "174.967"; 
//         ELEMENTS[71][3] = "1652"; // in Celsius
//         ELEMENTS[71][4] = "1652"; // in Celsius
//         ELEMENTS[71][5] = "1652"; // in Celsius
//         ELEMENTS[71][6] = "1652"; // in Celsius
//         ELEMENTS[71][7] = "1652"; // in Celsius
//         ELEMENTS[71][8] = "1652"; // in Celsius
//         ELEMENTS[71][9] = "1652"; // in Celsius
        

//         ELEMENTS[72][0] = "72"; 
//         ELEMENTS[72][1] = "hafnium"; 
//         ELEMENTS[72][2] = "178.49"; 
//         ELEMENTS[72][3] = "2150"; // in Celsius
//         ELEMENTS[72][4] = "5400"; // in Celsius
//         ELEMENTS[72][5] = "1.3"; // Pauling scale
//         ELEMENTS[72][6] = "4"; // group number
//         ELEMENTS[72][7] = "6"; // period number
//         ELEMENTS[72][8] = "[Xe] 4f14 5d2 6s2"; // electronic configuration
//         ELEMENTS[72][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[73][0] = "73"; 
//         ELEMENTS[73][1] = "tantalum"; 
//         ELEMENTS[73][2] = "180.9479"; 
//         ELEMENTS[73][3] = "2996"; // in Celsius
//         ELEMENTS[73][4] = "5425"; // in Celsius
//         ELEMENTS[73][5] = "1.5"; // Pauling scale
//         ELEMENTS[73][6] = "5"; // group number
//         ELEMENTS[73][7] = "6"; // period number
//         ELEMENTS[73][8] = "[Xe] 4f14 5d3 6s2"; // electronic configuration
//         ELEMENTS[73][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[74][0] = "74"; 
//         ELEMENTS[74][1] = "tungsten"; 
//         ELEMENTS[74][2] = "183.84"; 
//         ELEMENTS[74][3] = "3422"; // in Celsius
//         ELEMENTS[74][4] = "5555"; // in Celsius
//         ELEMENTS[74][5] = "2.36"; // Pauling scale
//         ELEMENTS[74][6] = "6"; // group number
//         ELEMENTS[74][7] = "6"; // period number
//         ELEMENTS[74][8] = "[Xe] 4f14 5d4 6s2"; // electronic configuration
//         ELEMENTS[74][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[75][0] = "75"; 
//         ELEMENTS[75][1] = "rhenium"; 
//         ELEMENTS[75][2] = "186.207"; 
//         ELEMENTS[75][3] = "3186"; // in Celsius
//         ELEMENTS[75][4] = "5596"; // in Celsius
//         ELEMENTS[75][5] = "1.9"; // Pauling scale
//         ELEMENTS[75][6] = "7"; // group number
//         ELEMENTS[75][7] = "6"; // period number
//         ELEMENTS[75][8] = "[Xe] 4f14 5d5 6s2"; // electronic configuration
//         ELEMENTS[75][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[76][0] = "76"; 
//         ELEMENTS[76][1] = "osmium"; 
//         ELEMENTS[76][2] = "190.23"; 
//         ELEMENTS[76][3] = "3033"; // in Celsius
//         ELEMENTS[76][4] = "5012"; // in Celsius
//         ELEMENTS[76][5] = "2.2"; // Pauling scale
//         ELEMENTS[76][6] = "8"; // group number
//         ELEMENTS[76][7] = "6"; // period number
//         ELEMENTS[76][8] = "[Xe] 4f14 5d6 6s2"; // electronic configuration
//         ELEMENTS[76][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[77][0] = "77"; 
//         ELEMENTS[77][1] = "iridium"; 
//         ELEMENTS[77][2] = "192.217"; 
//         ELEMENTS[77][3] = "2466"; // in Celsius
//         ELEMENTS[77][4] = "4428"; // in Celsius
//         ELEMENTS[77][5] = "2.20"; // Pauling scale
//         ELEMENTS[77][6] = "9"; // group number
//         ELEMENTS[77][7] = "6"; // period number
//         ELEMENTS[77][8] = "[Xe] 4f14 5d7 6s2"; // electronic configuration
//         ELEMENTS[77][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[78][0] = "78"; 
//         ELEMENTS[78][1] = "platinum"; 
//         ELEMENTS[78][2] = "195.078"; 
//         ELEMENTS[78][3] = "1768.3"; // in Celsius
//         ELEMENTS[78][4] = "3825"; // in Celsius
//         ELEMENTS[78][5] = "2.28"; // Pauling scale
//         ELEMENTS[78][6] = "10"; // group number
//         ELEMENTS[78][7] = "6"; // period number
//         ELEMENTS[78][8] = "[Xe] 4f14 5d9 6s1"; // electronic configuration
//         ELEMENTS[78][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[79][0] = "79"; 
//         ELEMENTS[79][1] = "gold"; 
//         ELEMENTS[79][2] = "196.9665"; 
//         ELEMENTS[79][3] = "1064.18"; // in Celsius
//         ELEMENTS[79][4] = "2856"; // in Celsius
//         ELEMENTS[79][5] = "2.54"; // Pauling scale
//         ELEMENTS[79][6] = "11"; // group number
//         ELEMENTS[79][7] = "6"; // period number
//         ELEMENTS[79][8] = "[Xe] 4f14 5d10 6s1"; // electronic configuration
//         ELEMENTS[79][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[80][0] = "80"; 
//         ELEMENTS[80][1] = "mercury"; 
//         ELEMENTS[80][2] = "200.59"; 
//         ELEMENTS[80][3] = "-38.83"; // in Celsius
//         ELEMENTS[80][4] = "356.73"; // in Celsius
//         ELEMENTS[80][5] = "2.00"; // Pauling scale
//         ELEMENTS[80][6] = "12"; // group number
//         ELEMENTS[80][7] = "6"; // period number
//         ELEMENTS[80][8] = "[Xe] 4f14 5d10 6s2"; // electronic configuration
//         ELEMENTS[80][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[81][0] = "81"; 
//         ELEMENTS[81][1] = "thallium"; 
//         ELEMENTS[81][2] = "204.3833"; 
//         ELEMENTS[81][3] = "304"; // in Celsius
//         ELEMENTS[81][4] = "1473"; // in Celsius
//         ELEMENTS[81][5] = "1.62"; // Pauling scale
//         ELEMENTS[81][6] = "13"; // group number
//         ELEMENTS[81][7] = "6"; // period number
//         ELEMENTS[81][8] = "[Xe] 4f14 5d10 6s2 6p1"; // electronic configuration
//         ELEMENTS[81][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[82][0] = "82"; 
//         ELEMENTS[82][1] = "lead"; 
//         ELEMENTS[82][2] = "207.2"; 
//         ELEMENTS[82][3] = "327.46"; // in Celsius
//         ELEMENTS[82][4] = "1749"; // in Celsius
//         ELEMENTS[82][5] = "2.33"; // Pauling scale
//         ELEMENTS[82][6] = "14"; // group number
//         ELEMENTS[82][7] = "6"; // period number
//         ELEMENTS[82][8] = "[Xe] 4f14 5d10 6s2 6p2"; // electronic configuration
//         ELEMENTS[82][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[83][0] = "83";
//         ELEMENTS[83][1] = "bismuth";
//         ELEMENTS[83][2] = "208.98";
//         ELEMENTS[83][3] = "271.4";
//         ELEMENTS[83][4] = "1564";
//         ELEMENTS[83][5] = "2.02";
//         ELEMENTS[83][6] = "15";
//         ELEMENTS[83][7] = "6";
//         ELEMENTS[83][8] = "[Xe] 6s2 4f14 5d10 6p3";
//         ELEMENTS[83][9] = "metal";

//         ELEMENTS[84][0] = "84"; 
//         ELEMENTS[84][1] = "polonium"; 
//         ELEMENTS[84][2] = "(209)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[84][3] = "254"; // in Celsius
//         ELEMENTS[84][4] = "962"; // in Celsius
//         ELEMENTS[84][5] = "2.0"; // Pauling scale
//         ELEMENTS[84][6] = "16"; // group number
//         ELEMENTS[84][7] = "6"; // period number
//         ELEMENTS[84][8] = "[Xe] 4f14 5d10 6s2 6p4"; // electronic configuration
//         ELEMENTS[84][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[85][0] = "85"; 
//         ELEMENTS[85][1] = "astatine"; 
//         ELEMENTS[85][2] = "(210)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[85][3] = "302"; // in Celsius
//         ELEMENTS[85][4] = "337"; // in Celsius
//         ELEMENTS[85][5] = "2.2"; // Pauling scale
//         ELEMENTS[85][6] = "17"; // group number
//         ELEMENTS[85][7] = "6"; // period number
//         ELEMENTS[85][8] = "[Xe] 4f14 5d10 6s2 6p5"; // electronic configuration
//         ELEMENTS[85][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[86][0] = "86"; 
//         ELEMENTS[86][1] = "radon"; 
//         ELEMENTS[86][2] = "(222)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[86][3] = "-71.15"; // in Celsius
//         ELEMENTS[86][4] = "-61.7"; // in Celsius
//         ELEMENTS[86][5] = "N/A"; // Pauling scale
//         ELEMENTS[86][6] = "18"; // group number
//         ELEMENTS[86][7] = "6"; // period number
//         ELEMENTS[86][8] = "[Xe] 4f14 5d10 6s2 6p6"; // electronic configuration
//         ELEMENTS[86][9] = "non-metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[87][0] = "87"; 
//         ELEMENTS[87][1] = "francium"; 
//         ELEMENTS[87][2] = "(223)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[87][3] = "27"; // in Celsius
//         ELEMENTS[87][4] = "677"; // in Celsius
//         ELEMENTS[87][5] = "0.7"; // Pauling scale
//         ELEMENTS[87][6] = "1"; // group number
//         ELEMENTS[87][7] = "7"; // period number
//         ELEMENTS[87][8] = "[Rn] 7s1"; // electronic configuration
//         ELEMENTS[87][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[88][0] = "88"; 
//         ELEMENTS[88][1] = "radium"; 
//         ELEMENTS[88][2] = "(226)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[88][3] = "700"; // in Celsius
//         ELEMENTS[88][4] = "1737"; // in Celsius
//         ELEMENTS[88][5] = "0.9"; // Pauling scale
//         ELEMENTS[88][6] = "2"; // group number
//         ELEMENTS[88][7] = "7"; // period number
//         ELEMENTS[88][8] = "[Rn] 7s2"; // electronic configuration
//         ELEMENTS[88][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[89][0] = "89"; 
//         ELEMENTS[89][1] = "actinium"; 
//         ELEMENTS[89][2] = "(227)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[89][3] = "1050"; // in Celsius
//         ELEMENTS[89][4] = "3200"; // in Celsius
//         ELEMENTS[89][5] = "1.1"; // Pauling scale
//         ELEMENTS[89][6] = "3"; // group number
//         ELEMENTS[89][7] = "7"; // period number
//         ELEMENTS[89][8] = "[Rn] 6d1 7s2"; // electronic configuration
//         ELEMENTS[89][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[90][0] = "90"; 
//         ELEMENTS[90][1] = "thorium"; 
//         ELEMENTS[90][2] = "232.0381"; 
//         ELEMENTS[90][3] = "1750"; // in Celsius
//         ELEMENTS[90][4] = "4790"; // in Celsius
//         ELEMENTS[90][5] = "1.3"; // Pauling scale
//         ELEMENTS[90][6] = "N/A"; // group number
//         ELEMENTS[90][7] = "7"; // period number
//         ELEMENTS[90][8] = "[Rn] 6d2 7s2"; // electronic configuration
//         ELEMENTS[90][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[91][0] = "91"; 
//         ELEMENTS[91][1] = "protactinium"; 
//         ELEMENTS[91][2] = "231.0359"; 
//         ELEMENTS[91][3] = "1568"; // in Celsius
//         ELEMENTS[91][4] = "4027"; // in Celsius
//         ELEMENTS[91][5] = "1.5"; // Pauling scale
//         ELEMENTS[91][6] = "N/A"; // group number
//         ELEMENTS[91][7] = "7"; // period number
//         ELEMENTS[91][8] = "[Rn] 5f2 6d1 7s2"; // electronic configuration
//         ELEMENTS[91][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[92][0] = "92"; 
//         ELEMENTS[92][1] = "uranium"; 
//         ELEMENTS[92][2] = "238.0289"; 
//         ELEMENTS[92][3] = "1132"; // in Celsius
//         ELEMENTS[92][4] = "3818"; // in Celsius
//         ELEMENTS[92][5] = "1.38"; // Pauling scale
//         ELEMENTS[92][6] = "N/A"; // group number
//         ELEMENTS[92][7] = "7"; // period number
//         ELEMENTS[92][8] = "[Rn] 5f3 6d1 7s2"; // electronic configuration
//         ELEMENTS[92][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[93][0] = "93"; 
//         ELEMENTS[93][1] = "neptunium"; 
//         ELEMENTS[93][2] = "(237)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[93][3] = "644"; // in Celsius
//         ELEMENTS[93][4] = "3902"; // in Celsius
//         ELEMENTS[93][5] = "1.36"; // Pauling scale
//         ELEMENTS[93][6] = "N/A"; // group number
//         ELEMENTS[93][7] = "7"; // period number
//         ELEMENTS[93][8] = "[Rn] 5f4 6d1 7s2"; // electronic configuration
//         ELEMENTS[93][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[94][0] = "94"; 
//         ELEMENTS[94][1] = "plutonium"; 
//         ELEMENTS[94][2] = "(244)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[94][3] = "640"; // in Celsius
//         ELEMENTS[94][4] = "3230"; // in Celsius
//         ELEMENTS[94][5] = "1.28"; // Pauling scale
//         ELEMENTS[94][6] = "N/A"; // group number
//         ELEMENTS[94][7] = "7"; // period number
//         ELEMENTS[94][8] = "7"; // period number
//         ELEMENTS[94][9] = "7"; // period number

//         ELEMENTS[95][0] = "95"; 
//         ELEMENTS[95][1] = "americium"; 
//         ELEMENTS[95][2] = "(243)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[95][3] = "994"; // in Celsius
//         ELEMENTS[95][4] = "2607"; // in Celsius
//         ELEMENTS[95][5] = "1.3"; // Pauling scale
//         ELEMENTS[95][6] = "N/A"; // group number
//         ELEMENTS[95][7] = "7"; // period number
//         ELEMENTS[95][8] = "[Rn] 5f7 7s2"; // electronic configuration
//         ELEMENTS[95][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[96][0] = "96"; 
//         ELEMENTS[96][1] = "curium"; 
//         ELEMENTS[96][2] = "(247)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[96][3] = "1340"; // in Celsius
//         ELEMENTS[96][4] = "N/A"; // boiling point unknown
//         ELEMENTS[96][5] = "1.3"; // Pauling scale
//         ELEMENTS[96][6] = "N/A"; // group number
//         ELEMENTS[96][7] = "7"; // period number
//         ELEMENTS[96][8] = "[Rn] 5f7 6d1 7s2"; // electronic configuration
//         ELEMENTS[96][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[97][0] = "97"; 
//         ELEMENTS[97][1] = "berkelium"; 
//         ELEMENTS[97][2] = "(247)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[97][3] = "986"; // in Celsius
//         ELEMENTS[97][4] = "N/A"; // boiling point unknown
//         ELEMENTS[97][5] = "1.3"; // Pauling scale
//         ELEMENTS[97][6] = "N/A"; // group number
//         ELEMENTS[97][7] = "7"; // period number
//         ELEMENTS[97][8] = "[Rn] 5f9 7s2"; // electronic configuration
//         ELEMENTS[97][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[98][0] = "98"; 
//         ELEMENTS[98][1] = "californium"; 
//         ELEMENTS[98][2] = "(251)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[98][3] = "900"; // in Celsius
//         ELEMENTS[98][4] = "N/A"; // boiling point unknown
//         ELEMENTS[98][5] = "1.3"; // Pauling scale
//         ELEMENTS[98][6] = "N/A"; // group number
//         ELEMENTS[98][7] = "7"; // period number
//         ELEMENTS[98][8] = "[Rn] 5f10 7s2"; // electronic configuration
//         ELEMENTS[98][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[99][0] = "99"; 
//         ELEMENTS[99][1] = "einsteinium"; 
//         ELEMENTS[99][2] = "(252)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[99][3] = "860"; // in Celsius
//         ELEMENTS[99][4] = "N/A"; // boiling point unknown
//         ELEMENTS[99][5] = "1.3"; // Pauling scale
//         ELEMENTS[99][6] = "N/A"; // group number
//         ELEMENTS[99][7] = "7"; // period number
//         ELEMENTS[99][8] = "[Rn] 5f11 7s2"; // electronic configuration
//         ELEMENTS[99][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[100][0] = "100"; 
//         ELEMENTS[100][1] = "fermium"; 
//         ELEMENTS[100][2] = "(257)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[100][3] = "1527"; // in Celsius
//         ELEMENTS[100][4] = "N/A"; // boiling point unknown
//         ELEMENTS[100][5] = "1.3"; // Pauling scale
//         ELEMENTS[100][6] = "N/A"; // group number
//         ELEMENTS[100][7] = "7"; // period number
//         ELEMENTS[100][8] = "[Rn] 5f12 7s2"; // electronic configuration
//         ELEMENTS[100][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[101][0] = "101"; 
//         ELEMENTS[101][1] = "mendelevium"; 
//         ELEMENTS[101][2] = "(258)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[101][3] = "N/A"; // melting point unknown
//         ELEMENTS[101][4] = "N/A"; // boiling point unknown
//         ELEMENTS[101][5] = "1.3"; // Pauling scale
//         ELEMENTS[101][6] = "N/A"; // group number
//         ELEMENTS[101][7] = "7"; // period number
//         ELEMENTS[101][8] = "[Rn] 5f13 7s2"; // electronic configuration
//         ELEMENTS[101][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[102][0] = "102"; 
//         ELEMENTS[102][1] = "nobelium"; 
//         ELEMENTS[102][2] = "(259)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[102][3] = "827"; // in Celsius
//         ELEMENTS[102][4] = "N/A"; // boiling point unknown
//         ELEMENTS[102][5] = "1.3"; // Pauling scale
//         ELEMENTS[102][6] = "N/A"; // group number
//         ELEMENTS[102][7] = "7"; // period number
//         ELEMENTS[102][8] = "[Rn] 5f14 7s2"; // electronic configuration
//         ELEMENTS[102][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[103][0] = "103"; 
//         ELEMENTS[103][1] = "lawrencium"; 
//         ELEMENTS[103][2] = "(262)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[103][3] = "1627"; // in Celsius
//         ELEMENTS[103][4] = "N/A"; // boiling point unknown
//         ELEMENTS[103][5] = "N/A"; // Pauling scale
//         ELEMENTS[103][6] = "3"; // group number
//         ELEMENTS[103][7] = "7"; // period number
//         ELEMENTS[103][8] = "[Rn] 5f14 7s2 7p1"; // electronic configuration
//         ELEMENTS[103][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[104][0] = "104"; 
//         ELEMENTS[104][1] = "rutherfordium"; 
//         ELEMENTS[104][2] = "(267)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[104][3] = "N/A"; // melting point unknown
//         ELEMENTS[104][4] = "N/A"; // boiling point unknown
//         ELEMENTS[104][5] = "N/A"; // Pauling scale
//         ELEMENTS[104][6] = "4"; // group number
//         ELEMENTS[104][7] = "7"; // period number
//         ELEMENTS[104][8] = "[Rn] 5f14 6d2 7s2"; // electronic configuration
//         ELEMENTS[104][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[105][0] = "105";
//         ELEMENTS[105][1] = "dubnium";
//         ELEMENTS[105][2] = "268";
//         ELEMENTS[105][3] = "Unknown";
//         ELEMENTS[105][4] = "Unknown";
//         ELEMENTS[105][5] = "Unknown";
//         ELEMENTS[105][6] = "5";
//         ELEMENTS[105][7] = "7";
//         ELEMENTS[105][8] = "[Rn] 5f14 6d3 7s2";
//         ELEMENTS[105][9] = "transition metal";

//         ELEMENTS[106][0] = "106"; 
//         ELEMENTS[106][1] = "seaborgium"; 
//         ELEMENTS[106][2] = "(271)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[106][3] = "N/A"; // melting point unknown
//         ELEMENTS[106][4] = "N/A"; // boiling point unknown
//         ELEMENTS[106][5] = "N/A"; // Pauling scale
//         ELEMENTS[106][6] = "6"; // group number
//         ELEMENTS[106][7] = "7"; // period number
//         ELEMENTS[106][8] = "[Rn] 5f14 6d4 7s2"; // electronic configuration
//         ELEMENTS[106][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[107][0] = "107"; 
//         ELEMENTS[107][1] = "bohrium"; 
//         ELEMENTS[107][2] = "(272)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[107][3] = "N/A"; // melting point unknown
//         ELEMENTS[107][4] = "N/A"; // boiling point unknown
//         ELEMENTS[107][5] = "N/A"; // Pauling scale
//         ELEMENTS[107][6] = "7"; // group number
//         ELEMENTS[107][7] = "7"; // period number
//         ELEMENTS[107][8] = "[Rn] 5f14 6d5 7s2"; // electronic configuration
//         ELEMENTS[107][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[108][0] = "108"; 
//         ELEMENTS[108][1] = "hassium"; 
//         ELEMENTS[108][2] = "(270)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[108][3] = "N/A"; // melting point unknown
//         ELEMENTS[108][4] = "N/A"; // boiling point unknown
//         ELEMENTS[108][5] = "N/A"; // Pauling scale
//         ELEMENTS[108][6] = "8"; // group number
//         ELEMENTS[108][7] = "7"; // period number
//         ELEMENTS[108][8] = "[Rn] 5f14 6d6 7s2"; // electronic configuration
//         ELEMENTS[108][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[109][0] = "109"; 
//         ELEMENTS[109][1] = "meitnerium"; 
//         ELEMENTS[109][2] = "(276)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[109][3] = "N/A"; // melting point unknown
//         ELEMENTS[109][4] = "N/A"; // boiling point unknown
//         ELEMENTS[109][5] = "N/A"; // Pauling scale
//         ELEMENTS[109][6] = "9"; // group number
//         ELEMENTS[109][7] = "7"; // period number
//         ELEMENTS[109][8] = "[Rn] 5f14 6d7 7s2"; // electronic configuration
//         ELEMENTS[109][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[110][0] = "110"; 
//         ELEMENTS[110][1] = "darmstadtium"; 
//         ELEMENTS[110][2] = "(281)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[110][3] = "N/A"; // melting point unknown
//         ELEMENTS[110][4] = "N/A"; // boiling point unknown
//         ELEMENTS[110][5] = "N/A"; // Pauling scale
//         ELEMENTS[110][6] = "10"; // group number
//         ELEMENTS[110][7] = "7"; // period number
//         ELEMENTS[110][8] = "[Rn] 5f14 6d9 7s1"; // electronic configuration
//         ELEMENTS[110][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[111][0] = "111"; 
//         ELEMENTS[111][1] = "roentgenium"; 
//         ELEMENTS[111][2] = "(280)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[111][3] = "N/A"; // melting point unknown
//         ELEMENTS[111][4] = "N/A"; // boiling point unknown
//         ELEMENTS[111][5] = "N/A"; // Pauling scale
//         ELEMENTS[111][6] = "11"; // group number
//         ELEMENTS[111][7] = "7"; // period number
//         ELEMENTS[111][8] = "[Rn] 5f14 6d10 7s1"; // electronic configuration
//         ELEMENTS[111][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[112][0] = "112"; 
//         ELEMENTS[112][1] = "copernicium"; 
//         ELEMENTS[112][2] = "(285)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[112][3] = "N/A"; // melting point unknown
//         ELEMENTS[112][4] = "N/A"; // boiling point unknown
//         ELEMENTS[112][5] = "N/A"; // Pauling scale
//         ELEMENTS[112][6] = "12"; // group number
//         ELEMENTS[112][7] = "7"; // period number
//         ELEMENTS[112][8] = "[Rn] 5f14 6d10 7s2"; // electronic configuration
//         ELEMENTS[112][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[113][0] = "113"; 
//         ELEMENTS[113][1] = "nihonium"; 
//         ELEMENTS[113][2] = "(284)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[113][3] = "N/A"; // melting point unknown
//         ELEMENTS[113][4] = "N/A"; // boiling point unknown
//         ELEMENTS[113][5] = "N/A"; // Pauling scale
//         ELEMENTS[113][6] = "13"; // group number
//         ELEMENTS[113][7] = "7"; // period number
//         ELEMENTS[113][8] = "[Rn] 5f14 6d10 7s2 7p1"; // electronic configuration
//         ELEMENTS[113][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[114][0] = "114"; 
//         ELEMENTS[114][1] = "flerovium"; 
//         ELEMENTS[114][2] = "(289)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[114][3] = "N/A"; // melting point unknown
//         ELEMENTS[114][4] = "N/A"; // boiling point unknown
//         ELEMENTS[114][5] = "N/A"; // Pauling scale
//         ELEMENTS[114][6] = "14"; // group number
//         ELEMENTS[114][7] = "7"; // period number
//         ELEMENTS[114][8] = "[Rn] 5f14 6d10 7s2 7p2"; // electronic configuration
//         ELEMENTS[114][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[115][0] = "115"; 
//         ELEMENTS[115][1] = "moscovium"; 
//         ELEMENTS[115][2] = "(288)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[115][3] = "N/A"; // melting point unknown
//         ELEMENTS[115][4] = "N/A"; // boiling point unknown
//         ELEMENTS[115][5] = "N/A"; // Pauling scale
//         ELEMENTS[115][6] = "15"; // group number
//         ELEMENTS[115][7] = "7"; // period number
//         ELEMENTS[115][8] = "[Rn] 5f14 6d10 7s2 7p3"; // electronic configuration
//         ELEMENTS[115][9] = "metal"; // metal or non-metal or metalloid
        
//         ELEMENTS[116][0] = "116";
//         ELEMENTS[116][1] = "Livermorium";
//         ELEMENTS[116][2] = "Unknown";
//         ELEMENTS[116][3] = "Unknown";
//         ELEMENTS[116][4] = "Unknown";
//         ELEMENTS[116][5] = "Unknown";
//         ELEMENTS[116][6] = "16";
//         ELEMENTS[116][7] = "7";
//         ELEMENTS[116][8] = "[Rn] 5f14 6d10 7s2 7p4";
//         ELEMENTS[116][9] = "post-transition metal";


//         ELEMENTS[117][0] = "117"; 
//         ELEMENTS[117][1] = "tennessine"; 
//         ELEMENTS[117][2] = "(294)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[117][3] = "N/A"; // melting point unknown
//         ELEMENTS[117][4] = "N/A"; // boiling point unknown
//         ELEMENTS[117][5] = "N/A"; // Pauling scale
//         ELEMENTS[117][6] = "17"; // group number
//         ELEMENTS[117][7] = "7"; // period number
//         ELEMENTS[117][8] = "[Rn] 5f14 6d10 7s2 7p5"; // electronic configuration
//         ELEMENTS[117][9] = "metalloid"; // metal or non-metal or metalloid
        
//         ELEMENTS[118][0] = "118"; 
//         ELEMENTS[118][1] = "oganesson"; 
//         ELEMENTS[118][2] = "(294)"; // atomic mass in parentheses indicates the mass number of the most stable isotope
//         ELEMENTS[118][3] = "N/A"; // melting point unknown
//         ELEMENTS[118][4] = "N/A"; // boiling point unknown
//         ELEMENTS[118][5] = "N/A"; // Pauling scale
//         ELEMENTS[118][6] = "18"; // group number
//         ELEMENTS[118][7] = "7"; // period number
//         ELEMENTS[118][8] = "[Rn] 5f14 6d10 7s2 7p6"; // electronic configuration
//         ELEMENTS[118][9] = "non-metal"; // metal or non-metal or metalloid

        
//     }
//     public static void main(String[] args) {
//         DATA_2 d1 = new DATA_2();
//         String s[][] = d1.ELEMENTS;
//         System.out.println("ELEMENTS[][] = {");
//         System.out.println();
//         for(int i = 0;i<s.length;i++){
//             System.out.print("{");
//             for(int j = 0;j<=9;j++){
//                 try {
                    
//                         if(j!=9){
//                             System.out.print("\""+s[i][j]+"\"" + ",");
//                         }else {
//                             System.out.print("\""+s[i][j]+"\"" );
//                         }
                    
//                 } catch (Exception e) {
//                     System.out.println(e);
//                 }
//             }
//             System.out.print("}"+",");
//             System.out.println();

//         }

//     }
// }    