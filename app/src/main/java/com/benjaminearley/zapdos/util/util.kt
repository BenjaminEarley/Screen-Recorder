package com.benjaminearley.zapdos.util

import android.Manifest
import android.annotation.TargetApi
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import com.benjaminearley.zapdos.onboarding.canMakeSmores

@TargetApi(Build.VERSION_CODES.M)
fun hasExternalStoragePermission(context: Context): Boolean {
    return !canMakeSmores() || context.checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED
}

@TargetApi(Build.VERSION_CODES.M)
fun hasMicPermission(context: Context): Boolean {
    return !canMakeSmores() || context.checkSelfPermission(Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED
}

object Pokemon {
    val names = hashMapOf(
            Pair("Bulbasaur",1),
            Pair("Ivysaur",2),
            Pair("Venusaur",3),
            Pair("Charmander",4),
            Pair("Charmeleon",5),
            Pair("Charizard",6),
            Pair("Squirtle",7),
            Pair("Wartortle",8),
            Pair("Blastoise",9),
            Pair("Caterpie",10),
            Pair("Metapod",11),
            Pair("Butterfree",12),
            Pair("Weedle",13),
            Pair("Kakuna",14),
            Pair("Beedrill",15),
            Pair("Pidgey",16),
            Pair("Pidgeotto",17),
            Pair("Pidgeot",18),
            Pair("Rattata",19),
            Pair("Raticate",20),
            Pair("Spearow",21),
            Pair("Fearow",22),
            Pair("Ekans",23),
            Pair("Arbok",24),
            Pair("Pikachu",25),
            Pair("Raichu",26),
            Pair("Sandshrew",27),
            Pair("Sandslash",28),
            Pair("Nidoran♀",29),
            Pair("Nidorina",30),
            Pair("Nidoqueen",31),
            Pair("Nidoran♂",32),
            Pair("Nidorino",33),
            Pair("Nidoking",34),
            Pair("Clefairy",35),
            Pair("Clefable",36),
            Pair("Vulpix",37),
            Pair("Ninetales",38),
            Pair("Jigglypuff",39),
            Pair("Wigglytuff",40),
            Pair("Zubat",41),
            Pair("Golbat",42),
            Pair("Oddish",43),
            Pair("Gloom",44),
            Pair("Vileplume",45),
            Pair("Paras",46),
            Pair("Parasect",47),
            Pair("Venonat",48),
            Pair("Venomoth",49),
            Pair("Diglett",50),
            Pair("Dugtrio",51),
            Pair("Meowth",52),
            Pair("Persian",53),
            Pair("Psyduck",54),
            Pair("Golduck",55),
            Pair("Mankey",56),
            Pair("Primeape",57),
            Pair("Growlithe",58),
            Pair("Arcanine",59),
            Pair("Poliwag",60),
            Pair("Poliwhirl",61),
            Pair("Poliwrath",62),
            Pair("Abra",63),
            Pair("Kadabra",64),
            Pair("Alakazam",65),
            Pair("Machop",66),
            Pair("Machoke",67),
            Pair("Machamp",68),
            Pair("Bellsprout",69),
            Pair("Weepinbell",70),
            Pair("Victreebel",71),
            Pair("Tentacool",72),
            Pair("Tentacruel",73),
            Pair("Geodude",74),
            Pair("Graveler",75),
            Pair("Golem",76),
            Pair("Ponyta",77),
            Pair("Rapidash",78),
            Pair("Slowpoke",79),
            Pair("Slowbro",80),
            Pair("Magnemite",81),
            Pair("Magneton",82),
            Pair("Farfetch'd",83),
            Pair("Doduo",84),
            Pair("Dodrio",85),
            Pair("Seel",86),
            Pair("Dewgong",87),
            Pair("Grimer",88),
            Pair("Muk",89),
            Pair("Shellder",90),
            Pair("Cloyster",91),
            Pair("Gastly",92),
            Pair("Haunter",93),
            Pair("Gengar",94),
            Pair("Onix",95),
            Pair("Drowzee",96),
            Pair("Hypno",97),
            Pair("Krabby",98),
            Pair("Kingler",99),
            Pair("Voltorb",100),
            Pair("Electrode",101),
            Pair("Exeggcute",102),
            Pair("Exeggutor",103),
            Pair("Cubone",104),
            Pair("Marowak",105),
            Pair("Hitmonlee",106),
            Pair("Hitmonchan",107),
            Pair("Lickitung",108),
            Pair("Koffing",109),
            Pair("Weezing",110),
            Pair("Rhyhorn",111),
            Pair("Rhydon",112),
            Pair("Chansey",113),
            Pair("Tangela",114),
            Pair("Kangaskhan",115),
            Pair("Horsea",116),
            Pair("Seadra",117),
            Pair("Goldeen",118),
            Pair("Seaking",119),
            Pair("Staryu",120),
            Pair("Starmie",121),
            Pair("Mr. Mime",122),
            Pair("Scyther",123),
            Pair("Jynx",124),
            Pair("Electabuzz",125),
            Pair("Magmar",126),
            Pair("Pinsir",127),
            Pair("Tauros",128),
            Pair("Magikarp",129),
            Pair("Gyarados",130),
            Pair("Lapras",131),
            Pair("Ditto",132),
            Pair("Eevee",133),
            Pair("Vaporeon",134),
            Pair("Jolteon",135),
            Pair("Flareon",136),
            Pair("Porygon",137),
            Pair("Omanyte",138),
            Pair("Omastar",139),
            Pair("Kabuto",140),
            Pair("Kabutops",141),
            Pair("Aerodactyl",142),
            Pair("Snorlax",143),
            Pair("Articuno",144),
            Pair("Zapdos",145),
            Pair("Moltres",146),
            Pair("Dratini",147),
            Pair("Dragonair",148),
            Pair("Dragonite",149),
            Pair("Mewtwo",150)
    )
}
