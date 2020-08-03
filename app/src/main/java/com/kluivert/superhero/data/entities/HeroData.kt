package com.kluivert.superhero.data.entities

import com.kluivert.superhero.R


class HeroData {
    fun heroData(): Array<Hero> {
        return arrayOf(
            Hero(0,"Superman",
                    "Superman is the sole survivor of the planet Krypton. His father, Jor-El, discovered that a nuclear chain " +
                    "reaction was building inside Krypton that would soon shatter the entire world. " +
                    "Jor-El therefore had his unborn son Kal-El removed from the Kryptonian Gestation " +
                    "Chambers and affixed the life matrix containing Kal-El to an experimental vessel for" +
                    " travel through hyperspace. Jor-El launched the starcraft toward Earth just before Krypton exploded." +
                    "",R.drawable.superman),
            Hero(1,"Batman","A family outing to the cinema ended in tragedy for young Bruce Wayne. Walking homeward, Bruce, his father," +
                    " Thomas, and mother, Martha, accidentally ventured into Gotham City's notorious \"Crime Alley\" and were accosted by a mugger.",R.drawable.batman),
            Hero(2,"Wonderwoman","Clad in a golden tiara, red bustier, knee-high boots and " +
                    "a star-spangled skirt, Wonder Woman first bounded onto the comic book pages in the fall of 1941 " +
                    "in a back-up story for “All Star Comics #8.” From the comic’s very first words, it was clear that this new superhero would be " +
                    "asked to represent her gender in a way that didn’t apply to male counterparts such as Superman and Batman. ",R.drawable.wonder),
            Hero(3,"Flash","A failed college football player in the 1930s, Jay Garrick became a research scientist. " +
                    "By accidentally inhaling the hyper-charged atoms of a radioactive liquid, Garrick gained incredible superspeed.",R.drawable.flashy),
            Hero(4,"Supergirl","Supergirl is Kara Zor-El, Superman's cousin from the planet Krypton and one of the most powerful heroes " +
                    "in the universe. She has been a member of the Justice League, the Legion of Super-Heroes and the Red Lantern Corps.",R.drawable.supergirl),
            Hero(5,"Green lantern","Hal Jordan is the greatest Green Lantern, an inter-galactic police officer " +
                    "and member of the Green Lantern Corps, " +
                    "chosen by the Guardians of the Universe for his ability to overcome great fear.",R.drawable.greenlantern),
            Hero(6,"Martian man hunter","Martian Manhunter, " +
                    "also known as J'onn J'onzz and John Jones, is a superhero from the planet Mars and the " +
                    "last surviving member of his race. A martian holocaust killed his wife and daughter, " +
                    "nearly driving him mad, " +
                    "until he was brought to Earth in an accident caused by scientist Saul Erdel.",R.drawable.martiaman),
            Hero(7,"Green arrow","Oliver Jonas Queen, a wealthy socialite who owned Queen Industries in Sky City. In most of the subsequent origin " +
                    "stories, Queen was abandoned on a deserted island and forced to take up archery in order to survive.",R.drawable.greenarrow),
            Hero(8,"Dr fate","ctor Fate is a legacy of heroes in the realm of magic who act as agents of" +
                    " the Lords of Order in the battle against chaos, using the powerful Amulet of Anubis," +
                    " Cloak of Destiny and Helmet of Fate.",R.drawable.drfate),
            Hero(9,"Aqua man","Aquaman, also known as Arthur Curry and Orin, " +
                    "is a superhero and the ruler of the seas. As the king of Atlantis and other " +
                    "undersea territories, he technically controls most of the planet.",R.drawable.aquaman)

        )
    }
}
