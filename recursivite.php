<?php
/*nbr max d'itération 300
Pour la suite des nbr entier, on va utiliser une fonction qui va prendre en paramètre un nbr
ajouter +1 et l'afficher n= (n-1)+1
*/

$nbrIterationMax = 300;
$nombre = 0;

public function suiteEntier($n){
	echo $nbrIterationMax;
	$nbrIterationMax--;
	if ($nbrIterationMax > 0){
	return suiteEntier($n)+1;
	}

	else{
	return 0;
	}
}
	
