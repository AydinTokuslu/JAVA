package day37_Agustos_10_2021_dersi_Inheritance;

public class inheritance_tekrar {

	/*
	1)Java’da class’lar arasinda parent(Aile)-child(Cocuk) relationship(iliski) vardir.

2)Parent Class’a “super class” da denir. Child Class’a “sub class” da denir.
 
3)Ortak ozellikler parent class’a, specific uniqe ozellikler child class’a yazilir.
 
4)Parent Child Relationship “reusability” (tekrarlı kullanım), “maintenance” (tamir), “less code” (az kod), 
	“well organization” (iyi organizasyon) acilarindan faydalidir.********
 
5)Child classlar parent’lardaki her methodu ve variable’i kullanabilir ama parent class child’dakileri kullanamaz.
 
6)Java “Multiple Inheritance”’i desteklemez. Yani; Java’da bir Child Class’in 1’den fazla parent’i olamaz.**** interview sorusu
 
7)Bir parent class, 1'den fazla child class ile olusturulan parent child relationship’e “Hierarchical Inheritance” denir.     
 
 
8)Child-Parent-Grandparent... seklinde olusturulan cok katli parent child relationshipe’e multi-level inheritance denir.**** interview sorusu
 
9)“Object Class” butun classlarin parent class’idir. Java’da parent class’i olmayan tek class “Object Class”dir.**** interview sorusu
	
**** interview sorusu	: javada oop konseptte classlar arasindaki parent-child iliskisinde sinir var midir? varsa nedir?
	cevap :  sinir yoktur, istenildigi kadar multilevel inheritance yapilabilir.
	
****	bir obje create edildiginde once parenteki constructor sonra da hiyerarsik olarak daha sonra gelen cons, en son objenin cons‘u calisir 

**** bir class‘ta constructor calistirdigimizda once parent class‘daki constructor calisir.
*cunku her constructor‘in ilk satirinda super()(bizi atamiza goturmeye, ata‘nin constructor‘larina ulasmayi saglar.) keyword vardir (gorunmese ile).
* parent-child iliskisi yoksa super() yoktur, olmasi icin inheritance olmalidir.
* 
* Inheritance faydalari;
* - reusability (tekrarlı kullanım)
* - kolay maintenance (idame)
* - az kodla cok is yapma (less code)
* - tekrarlari engelleme (well organization (iyi organizasyon))

	*
	*
	*
	*/
	
	
}
