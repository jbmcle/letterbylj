package app.msfaithlj.constant

import android.content.Context
import android.graphics.Color
import app.msfaithlj.R
import app.msfaithlj.model.BirthdayLetter

object Constant {

//    fun BDAY_LETTER_BY_MSFAITH(context: Context) = mutableListOf(
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_1,
//            herLetter = "mao jud ning na meet nimos inday sara :> tinarayan ka beh, payag ka non? btw diku kalimot ani kay nag\n" +
//                    "double date ming beshycakes! kaulion nasya ato bey whahahah dipa unta ko mo uli huhuness :( naglagot jud\n" +
//                    "bitaw ko ani kay gikataw-an ko ninyo pagtawag sakong second name shetzz pero na enjoy ko! <3",
//            paperBgColor = context.getColor(R.color.sky_blue),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_2,
//            herLetter = "3rd date ni natu ug kabalo ko nga nalingaw kas tagna tagna ani HAHAH\n" +
//                    "cute kaykag reactionb pagtubag nakos imong pangutana ani\n" +
//                    "naka hangad man sa taas HAHAHA anyways maulaw wmeheheh busa lami kaayo\n" +
//                    "pag ako imong katalk diba? yeah...",
//            paperBgColor = context.getColor(R.color.violet),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_3,
//            herLetter = "mga mamistahay! HAHAHAH tbh first time ni nako naki kaon sa laing balay\n" +
//                    "igna si amper lami kaayo ang spaghetti wheheh... na ulaw kaayo ko ani pero\n" +
//                    "k lang kay naa mnka.\n" +
//                    "mao sad ning first time nga dugay ko nakauli skl\n" +
//                    "BWAHAHAHAH anyways thanks sa paghungit. I FEEL LIKE A PRINCESS HERE <3 <3 <3",
//            paperBgColor = context.getColor(R.color.pink),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_4,
//            herLetter = "kagwapo ba saakong tapad! mura jud ug actor pakiss nga jok. thanks kaayo sa pag atiman\n" +
//                    "saako ani dol huhu saon taman gipa shat kung madam jake. nalipong rako atu ha busa\n" +
//                    "ni higda kos balas HAHAHAH diku kalimot sa imung gi ingon ani ana ka \"diko maligo\" pero\n" +
//                    "gi ubanan ko nimos dagat HAHAHA naka dress pa si ante mwehehe pero ni uli jud ka nga basa\n" +
//                    "og short HAHA",
//            paperBgColor = Color.BLUE,
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_5,
//            herLetter = "the smile tho... btw jojowain, mamahalin, iingatan, aasawahin, pagsisilbihan, aalagaan, papakasalan,\n" +
//                    "the one that I adore, the one that I cant live without, my one & only mamahalin habang buhay, to have and\n" +
//                    "to hold in sickness and in health for richer or poorer to love and cherish from\n" +
//                    "this day forward until death do us part. YES FATHER I DO.",
//            paperBgColor = Color.RED,
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_6,
//            herLetter = "after speech choir lupad tas chingkeetea, dabest kayka ani gi vid nimo\n" +
//                    "akong pimple >.< nag ilog tas cp nako kay gusto ka makakita sakong\n" +
//                    "performance but wako ganahi thats why wala nako gipakita pero shems naa man\n" +
//                    "tay maestra nga hilig mag video so ayun gi send sa GC :) btw gwapo\n" +
//                    "kayka ani murag kiss",
//            paperBgColor = context.getColor(R.color.violet),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_7,
//            herLetter = "nice kaayo diri babe pero mahal lang ang mga pagkaon HAHA tas pang family sya then perfect pud pag\n" +
//                    "naay occassion! pero gi critic jud nimo ang flower nila babe HAHAH chada, nalingaw ko ani bisag gasakit\n" +
//                    "akong eyes tungod sa lens tsk nalingaw pud kog paminaw saimong thoughts :)",
//            paperBgColor = context.getColor(R.color.sky_blue),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_8,
//            herLetter = "Acting like walay nahitabo pero gasakit najud akong tiil ana kent :'< sge pajud\n" +
//                    "tag libot2x gikapoy kaayo ko ana tas nisamot akong kakapoy kay nag sge tag saka og\n" +
//                    "naog huhuh maygani gwapo rakayka para masuko ko! >.< pero lami jud ang shawarma\n" +
//                    "ug imong hugs & kisses bey HAHAHAH bye.",
//            paperBgColor = context.getColor(R.color.violet),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_9,
//            herLetter = "First date natu ni dugay pajud kayka pero worth-it akong paghulat-hulat kay gwapo man\n" +
//                    "ang gihulatan naks nemen :P unexpected kaayong ang cinedate huhu firstime\n" +
//                    "nako mag tan-aw movie w my lover\n" +
//                    "pero diko magsaba nga gikilig ko atong paghatag nimos jacket ka gitugnaw ang baby mweheh thanks\n" +
//                    "diay sa pag drop nimo saako gwapo! lahams kta so much mwamwa.",
//            paperBgColor = Color.BLUE,
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_10,
//            herLetter = "after ani nga laag dungan tag hilantan HAHAHAH worth-it gihapon kay nauban\n" +
//                    "si idok, aayyy wala diay ko nalipay ani kay na trippingan kos iring shet huhunes\n" +
//                    "wapa nawala ang pali :'< perp infairness nice ayo ang view sa forest cafe",
//            paperBgColor = Color.BLUE,
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_11,
//            herLetter = "hoay i love camhills pero mas love man tika shesh, bitaw happy ayo ko ani babe bet ayo ang sunset tas ang view shems kayka dol!\n" +
//                    "love you ayo bey kblo jud kas akong ganahan ang sunset jud hehe pero ikaw man akong favourite view, so handsome!",
//            paperBgColor = context.getColor(R.color.pink),
//        ),
//        BirthdayLetter(
//            imageRes = R.drawable.bday_letter_12,
//            herLetter = "mangaon raman unta ta ani pero nakalahos man chada sad kaykag doul ani hab :) wako nag expect nga ma meet nako ang isa\n" +
//                    "sa imong mga friends hehe boss elden gani. mao mn siguro ning ni ingon ka nga gi head to food kos babae HAHAHA hoay pero bet nako\n" +
//                    "ang holding hands under the table sksksksk bahalag gi kanchawan nimo akong kamot heh!",
//            paperBgColor = Color.GREEN,
//        ),
//    )

    fun BDAY_LETTER_BY_MSFAITH(context: Context) = mutableListOf(
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_1,
            herLetter = "mao jud ning na meet nimos inday sara :> tinarayan ka beh, payag ka non? btw diku kalimot ani kay nag double date ming beshycakes! kaulion nasya ato bey whahahah dipa unta ko mo uli huhuness :(\nnaglagot jud bitaw ko ani kay gikataw-an ko ninyo pagtawag sakong second name shetzz pero na enjoy ko! <3",
            paperBgColor = context.getColor(R.color.sky_blue),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_2,
            herLetter = "3rd date ni natu ug kabalo ko nga nalingaw kas tagna tagna ani HAHAH cute kaykag reaction pagtubag nakos imong pangutana ani naka hangad man sa taas HAHAHA anyways maulaw wmeheheh busa lami kaayo pag ako imong katalk diba? yeah...",
            paperBgColor = context.getColor(R.color.violet),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_3,
            herLetter = "mga mamistahay! HAHAHAH tbh first time ni nako naki kaon sa laing balay igna si amper lami kaayo ang spaghetti wheheh... na ulaw kaayo ko ani pero k lang kay naa mnka. mao sad ning first time nga dugay ko nakauli skl BWAHAHAHAH anyways thanks sa paghungit. I FEEL LIKE A PRINCESS HERE <3 <3 <3",
            paperBgColor = context.getColor(R.color.pink),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_4,
            herLetter = "kagwapo ba saakong tapad! mura jud ug actor pakiss nga jok. thanks kaayo sa pag atiman saako ani dol huhu saon taman gipa shat kung madam jane. nalipong rako atu ha busa ni higda kos balas HAHAHAH diku kalimot sa imung gi ingon ani ana ka \"diko maligo\" pero gi ubanan ko nimos dagat HAHAHA naka dress pa si ante mwehehe pero ni uli jud ka nga basa og short HAHA",
            paperBgColor = Color.BLUE,
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_6,
            herLetter = "after speech choir lupad tas chingkeetea, dabest kayka ani gi vid nimo akong pimple >.< nag ilog tas cp nako kay gusto ka makakita sakong performance but wako ganahi thats why wala nako gipakita pero shems naa man tay maestra nga hilig mag video so ayun gi send sa GC :) btw gwapo kayka ani murag kiss",
            paperBgColor = context.getColor(R.color.violet),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_7,
            herLetter = "nice kaayo diri babe pero mahal lang ang mga pagkaon HAHA tas pang family sya then perfect pud pag naay occassion! pero gi critic jud nimo ang flower nila babe HAHAH chada, nalingaw ko ani bisag gasakit akong eyes tungod sa lens tsk nalingaw pud kog paminaw saimong thoughts :)",
            paperBgColor = context.getColor(R.color.sky_blue),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_8,
            herLetter = "Acting like walay nahitabo pero gasakit najud akong tiil ana kent :'< sge pajud tag libot2x gikapoy kaayo ko ana tas nisamot akong kakapoy kay nag sge tag saka og naog huhuh maygani gwapo rakayka para masuko ko! >.< pero lami jud ang shawarma ug imong hugs & kisses bey HAHAHAH bye.",
            paperBgColor = context.getColor(R.color.violet),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_9,
            herLetter = "First date natu ni dugay pajud kayka pero worth-it akong paghulat-hulat kay gwapo man ang gihulatan naks nemen :P unexpected kaayong ang cinedate huhu firstime nako mag tan-aw movie w my lover pero diko magsaba nga gikilig ko atong paghatag nimos jacket ka gitugnaw ang baby mweheh thanks diay sa pag drop nimo saako gwapo! lahams kta so much mwamwa.",
            paperBgColor = Color.BLUE,
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_10,
            herLetter = "after ani nga laag dungan tag hilantan HAHAHAH worth-it gihapon kay nauban si idok, aayyy wala diay ko nalipay ani kay na trippingan kos iring shet huhunes wapa nawala ang pali :'< pero infairness nice ayo ang view sa forest cafe",
            paperBgColor = Color.BLUE,
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_11,
            herLetter = "hoay i love camhills pero mas love man tika shesh, bitaw happy ayo ko ani babe bet ayo ang sunset tas ang view shems kayka dol! love you ayo bey kblo jud kas akong ganahan ang sunset jud hehe pero ikaw man akong favourite view, so handsome!",
            paperBgColor = context.getColor(R.color.pink),
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_12,
            herLetter = "mangaon raman unta ta ani pero nakalahos man chada sad kaykag doul ani hab :) wako nag expect nga ma meet nako ang isa sa imong mga friends hehe boss elden gani. mao mn siguro ning ni ingon ka nga gi head to foot kos babae HAHAHA hoay pero bet nako ang holding hands under the table sksksksk bahalag gi kanchawan nimo akong kamot heh!",
            paperBgColor = Color.GREEN,
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letter_5,
            herLetter = "the smile tho... btw jojowain, mamahalin, iingatan, aasawahin, pagsisilbihan, aalagaan, papakasalan, the one that I adore, the one that I cant live without, my one & only mamahalin habang buhay, to have and to hold in sickness and in health for richer or poorer to love and cherish from this day forward until death do us part. YES FATHER I DO.",
            paperBgColor = Color.RED,
        ),
        BirthdayLetter(
            imageRes = R.drawable.bday_letters_preview,
            herLetter = "LJ\'s letter app. Made with passion by JJK.",
            paperBgColor = context.getColor(R.color.sky_blue),
        )
    )


}