import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject
import com.nuazure.firestore.FirestoreResponse

fun main(args: Array<String>) {
    val jsonData = """{
    "name": "projects/pubu-ebooks-android/databases/(default)/documents/proxy_data_omed/data",
    "fields": {
        "restrictedCategories": {
            "arrayValue": {
                "values": [
                    {
                        "integerValue": "289"
                    },
                    {
                        "integerValue": "291"
                    },
                    {
                        "integerValue": "292"
                    },
                    {
                        "integerValue": "293"
                    },
                    {
                        "integerValue": "294"
                    },
                    {
                        "integerValue": "387"
                    },
                    {
                        "integerValue": "389"
                    },
                    {
                        "integerValue": "390"
                    },
                    {
                        "integerValue": "391"
                    },
                    {
                        "integerValue": "392"
                    },
                    {
                        "integerValue": "395"
                    },
                    {
                        "integerValue": "399"
                    },
                    {
                        "integerValue": "400"
                    },
                    {
                        "integerValue": "401"
                    },
                    {
                        "integerValue": "402"
                    },
                    {
                        "integerValue": "441"
                    },
                    {
                        "integerValue": "442"
                    },
                    {
                        "integerValue": "444"
                    },
                    {
                        "integerValue": "445"
                    },
                    {
                        "integerValue": "1011"
                    },
                    {
                        "integerValue": "1020"
                    },
                    {
                        "integerValue": "1022"
                    },
                    {
                        "integerValue": "1023"
                    }
                ]
            }
        },
        "launcherBroadcastUrl": {
            "stringValue": "https://res1.pubu.tw/api/broadcast/launcher/index.html"
        },
        "publisherAnti": {
            "mapValue": {
                "fields": {
                    "publisherList": {
                        "arrayValue": {
                            "values": [
                                {
                                    "stringValue": "威登文創"
                                },
                                {
                                    "stringValue": "泰北文創"
                                },
                                {
                                    "stringValue": "kora酷啦"
                                },
                                {
                                    "stringValue": "翔男優"
                                },
                                {
                                    "stringValue": "泰漾文化"
                                },
                                {
                                    "stringValue": "哈德文化"
                                },
                                {
                                    "stringValue": "雙子文化"
                                },
                                {
                                    "stringValue": "戈斯文化"
                                },
                                {
                                    "stringValue": "那蓋"
                                },
                                {
                                    "stringValue": "閱男文化"
                                },
                                {
                                    "stringValue": "鮮活誌"
                                },
                                {
                                    "stringValue": "ART亞特文化"
                                },
                                {
                                    "stringValue": "質男幫"
                                },
                                {
                                    "stringValue": "馬席菻"
                                },
                                {
                                    "stringValue": "Artie Liu"
                                },
                                {
                                    "stringValue": "謝翔于"
                                },
                                {
                                    "stringValue": "普洛達康"
                                },
                                {
                                    "stringValue": "Good Guy熱愛"
                                },
                                {
                                    "stringValue": "亞當文創"
                                },
                                {
                                    "stringValue": "嗨Mr.H"
                                },
                                {
                                    "stringValue": "人良土兀"
                                },
                                {
                                    "stringValue": "泰陽"
                                },
                                {
                                    "stringValue": "亞升"
                                },
                                {
                                    "stringValue": "ADDICT E'Zine"
                                },
                                {
                                    "stringValue": "tuxedothailand"
                                },
                                {
                                    "stringValue": "G-Boy"
                                },
                                {
                                    "stringValue": "MYTH MEN"
                                },
                                {
                                    "stringValue": "magazinebytey"
                                },
                                {
                                    "stringValue": "ONGNEED"
                                },
                                {
                                    "stringValue": "BEARMEN MAGAZINE"
                                },
                                {
                                    "stringValue": "楊任淑"
                                },
                                {
                                    "stringValue": "Aman Photobook"
                                },
                                {
                                    "stringValue": "AJOO GROUP"
                                },
                                {
                                    "stringValue": "Trisorn M"
                                },
                                {
                                    "stringValue": "Adam_Photobook"
                                },
                                {
                                    "stringValue": "River Kanjanakri"
                                },
                                {
                                    "stringValue": "Faithmag"
                                },
                                {
                                    "stringValue": "Esanplaza Life"
                                },
                                {
                                    "stringValue": "iammagazine"
                                },
                                {
                                    "stringValue": "SEXTEBOOK"
                                },
                                {
                                    "stringValue": "蒲美文化"
                                },
                                {
                                    "stringValue": "百男誌~"
                                },
                                {
                                    "stringValue": "Mu Shu"
                                },
                                {
                                    "stringValue": "Apollomagazine"
                                },
                                {
                                    "stringValue": "NEXTMEN"
                                },
                                {
                                    "stringValue": "Buddy Magazine"
                                },
                                {
                                    "stringValue": "Brothers Mag"
                                },
                                {
                                    "stringValue": "alongtimebook"
                                },
                                {
                                    "stringValue": "awesomemenbkk"
                                },
                                {
                                    "stringValue": "BANG! MAGAZINE"
                                },
                                {
                                    "stringValue": "扼男"
                                },
                                {
                                    "stringValue": "Apollomagazine"
                                },
                                {
                                    "stringValue": "G-BOT"
                                },
                                {
                                    "stringValue": "ONYX"
                                },
                                {
                                    "stringValue": "KADO花道"
                                },
                                {
                                    "stringValue": "Dash Magazine"
                                },
                                {
                                    "stringValue": "雷神一號"
                                },
                                {
                                    "stringValue": "DNABlue 藍攝體"
                                },
                                {
                                    "stringValue": "狂歡"
                                },
                                {
                                    "stringValue": "RAW Photo Book"
                                },
                                {
                                    "stringValue": "Fetish_Magazine"
                                },
                                {
                                    "stringValue": "男侍"
                                },
                                {
                                    "stringValue": "Riziist & aWake"
                                },
                                {
                                    "stringValue": "TERA出版"
                                },
                                {
                                    "stringValue": "LabourBKK"
                                },
                                {
                                    "stringValue": "飛機杯盲測"
                                },
                                {
                                    "stringValue": "DanDash"
                                },
                                {
                                    "stringValue": "Mshooter-CUM"
                                },
                                {
                                    "stringValue": "XXDanieL STUDIO"
                                },
                                {
                                    "stringValue": "情遇"
                                },
                                {
                                    "stringValue": "Repick magazine"
                                },
                                {
                                    "stringValue": "DU Dek"
                                },
                                {
                                    "stringValue": "韩塞"
                                },
                                {
                                    "stringValue": "Strongman壯強攝影寫真"
                                },
                                {
                                    "stringValue": "Adult magazine"
                                },
                                {
                                    "stringValue": "MshooterV"
                                },
                                {
                                    "stringValue": "亞升 magazine"
                                },
                                {
                                    "stringValue": "虎攝無界"
                                },
                                {
                                    "stringValue": "星洲娛樂"
                                },
                                {
                                    "stringValue": "耍帥"
                                },
                                {
                                    "stringValue": "AVENUE MAG"
                                },
                                {
                                    "stringValue": "Tai phoon"
                                },
                                {
                                    "stringValue": "茶麥"
                                },
                                {
                                    "stringValue": "G-POP"
                                },
                                {
                                    "stringValue": "松鼠愛栗子"
                                },
                                {
                                    "stringValue": "baobaoteam"
                                },
                                {
                                    "stringValue": "Yilo"
                                },
                                {
                                    "stringValue": "Urman Team"
                                },
                                {
                                    "stringValue": "竹書房"
                                },
                                {
                                    "stringValue": "wakeupmagazine"
                                },
                                {
                                    "stringValue": "J-YAU 遊"
                                },
                                {
                                    "stringValue": "双生視覺"
                                },
                                {
                                    "stringValue": "夏雨文"
                                },
                                {
                                    "stringValue": "杰 克"
                                },
                                {
                                    "stringValue": "RICH BOOK"
                                },
                                {
                                    "stringValue": "馬修 Macho"
                                },
                                {
                                    "stringValue": "艷情-XROMANCE"
                                },
                                {
                                    "stringValue": "弘方實業社"
                                },
                                {
                                    "stringValue": "布萊斯特"
                                },
                                {
                                    "stringValue": "Mu Chum"
                                },
                                {
                                    "stringValue": "HIGH010"
                                },
                                {
                                    "stringValue": "林奇遊"
                                },
                                {
                                    "stringValue": "ELEMENT Magazine"
                                },
                                {
                                    "stringValue": "翔氣"
                                },
                                {
                                    "stringValue": "AJ Leung"
                                },
                                {
                                    "stringValue": "楠喃攝影室"
                                },
                                {
                                    "stringValue": "HansLe"
                                },
                                {
                                    "stringValue": "DICK19"
                                },
                                {
                                    "stringValue": "KYLEWENGPHOTO攝情"
                                },
                                {
                                    "stringValue": "拉扣斯"
                                },
                                {
                                    "stringValue": "胡理安"
                                },
                                {
                                    "stringValue": "拉拉雄"
                                },
                                {
                                    "stringValue": "Peach Peach"
                                },
                                {
                                    "stringValue": "gayliangliang"
                                },
                                {
                                    "stringValue": "拉里"
                                },
                                {
                                    "stringValue": "emily.chen"
                                },
                                {
                                    "stringValue": "luxephotobook"
                                },
                                {
                                    "stringValue": "納米比亞"
                                },
                                {
                                    "stringValue": "STONMAGAZINE"
                                },
                                {
                                    "stringValue": "tarosohon"
                                },
                                {
                                    "stringValue": "HazzBand Channel"
                                },
                                {
                                    "stringValue": "XTERcomic"
                                },
                                {
                                    "stringValue": "MangmoomCulture"
                                },
                                {
                                    "stringValue": "Banana62"
                                },
                                {
                                    "stringValue": "thebookteam2562"
                                },
                                {
                                    "stringValue": "Qanatomy Team"
                                },
                                {
                                    "stringValue": "Gesture Magazine"
                                },
                                {
                                    "stringValue": "Gesture Magazine"
                                },
                                {
                                    "stringValue": "STEV Magazine"
                                },
                                {
                                    "stringValue": "MagnitudeMag"
                                },
                                {
                                    "stringValue": "健識攝影"
                                },
                                {
                                    "stringValue": "魔鏡"
                                },
                                {
                                    "stringValue": "Jaochihwei.com"
                                },
                                {
                                    "stringValue": "HOLIDAYS boy"
                                },
                                {
                                    "stringValue": "Andward Peng"
                                },
                                {
                                    "stringValue": "Bk Boyy Story"
                                },
                                {
                                    "stringValue": "GD boy"
                                },
                                {
                                    "stringValue": "上癮"
                                },
                                {
                                    "stringValue": "男子圖鑑"
                                },
                                {
                                    "stringValue": "Like boys"
                                },
                                {
                                    "stringValue": "Men's Rush.TV"
                                },
                                {
                                    "stringValue": "BOYS IN MIND"
                                },
                                {
                                    "stringValue": "Modelo"
                                },
                                {
                                    "stringValue": "Wing Thailand"
                                },
                                {
                                    "stringValue": "Grooby"
                                },
                                {
                                    "stringValue": "mierephotography"
                                },
                                {
                                    "stringValue": "Vu Benny"
                                },
                                {
                                    "stringValue": "星崎兄弟"
                                },
                                {
                                    "stringValue": "westphillips"
                                },
                                {
                                    "stringValue": "glossmen.com"
                                },
                                {
                                    "stringValue": "likeboys「Seiya」"
                                },
                                {
                                    "stringValue": "性感大雄 "
                                },
                                {
                                    "stringValue": "D uy Anh Vu"
                                },
                                {
                                    "stringValue": "funnymanmagazine"
                                },
                                {
                                    "stringValue": "zongzi0428"
                                },
                                {
                                    "stringValue": "kuroshio"
                                },
                                {
                                    "stringValue": "muscleboy"
                                },
                                {
                                    "stringValue": "MomenPlus"
                                },
                                {
                                    "stringValue": "Aper Huang"
                                }
                            ]
                        }
                    },
                    "publisherIdlist": {
                        "arrayValue": {
                            "values": [
                                {
                                    "integerValue": "339761"
                                },
                                {
                                    "integerValue": "3204426"
                                },
                                {
                                    "integerValue": "3235610"
                                },
                                {
                                    "integerValue": "2962307"
                                },
                                {
                                    "integerValue": "3087899"
                                },
                                {
                                    "integerValue": "3244610"
                                },
                                {
                                    "integerValue": "3244611"
                                },
                                {
                                    "integerValue": "3227689"
                                },
                                {
                                    "integerValue": "3049963"
                                },
                                {
                                    "integerValue": "3255734"
                                },
                                {
                                    "integerValue": "3246435"
                                },
                                {
                                    "integerValue": "3087945"
                                },
                                {
                                    "integerValue": "64186"
                                },
                                {
                                    "integerValue": "140780"
                                },
                                {
                                    "integerValue": "2912497"
                                },
                                {
                                    "integerValue": "2694286"
                                },
                                {
                                    "integerValue": "198703"
                                },
                                {
                                    "integerValue": "11407"
                                },
                                {
                                    "integerValue": "3441473"
                                },
                                {
                                    "integerValue": "3441495"
                                },
                                {
                                    "integerValue": "3441514"
                                },
                                {
                                    "integerValue": "3441509"
                                },
                                {
                                    "integerValue": "3418300"
                                },
                                {
                                    "integerValue": "3519200"
                                },
                                {
                                    "integerValue": "3458126"
                                },
                                {
                                    "integerValue": "3220407"
                                },
                                {
                                    "integerValue": "3207240"
                                },
                                {
                                    "integerValue": "2895269"
                                },
                                {
                                    "integerValue": "3494647"
                                },
                                {
                                    "integerValue": "3513958"
                                },
                                {
                                    "integerValue": "120626"
                                },
                                {
                                    "integerValue": "3502456"
                                },
                                {
                                    "integerValue": "3503149"
                                },
                                {
                                    "integerValue": "3443382"
                                },
                                {
                                    "integerValue": "3498948"
                                },
                                {
                                    "integerValue": "3254382"
                                },
                                {
                                    "integerValue": "3427407"
                                },
                                {
                                    "integerValue": "3213319"
                                },
                                {
                                    "integerValue": "3211740"
                                },
                                {
                                    "integerValue": "3125906"
                                },
                                {
                                    "integerValue": "3523289"
                                },
                                {
                                    "integerValue": "3338924"
                                },
                                {
                                    "integerValue": "472223"
                                },
                                {
                                    "integerValue": "3558654"
                                },
                                {
                                    "integerValue": "3539583"
                                },
                                {
                                    "integerValue": "3477231"
                                },
                                {
                                    "integerValue": "3550900"
                                },
                                {
                                    "integerValue": "3555208"
                                },
                                {
                                    "integerValue": "3542810"
                                },
                                {
                                    "integerValue": "3540092"
                                },
                                {
                                    "integerValue": "3499723"
                                },
                                {
                                    "integerValue": "3558654"
                                },
                                {
                                    "integerValue": "3247935"
                                },
                                {
                                    "integerValue": "3572989"
                                },
                                {
                                    "integerValue": "3571593"
                                },
                                {
                                    "integerValue": "3555881"
                                },
                                {
                                    "integerValue": "3576369"
                                },
                                {
                                    "integerValue": "2068722"
                                },
                                {
                                    "integerValue": "3580515"
                                },
                                {
                                    "integerValue": "3580740"
                                },
                                {
                                    "integerValue": "3581957"
                                },
                                {
                                    "integerValue": "3344401"
                                },
                                {
                                    "integerValue": "3206681"
                                },
                                {
                                    "integerValue": "3596271"
                                },
                                {
                                    "integerValue": "3606465"
                                },
                                {
                                    "integerValue": "3608892"
                                },
                                {
                                    "integerValue": "3608795"
                                },
                                {
                                    "integerValue": "3325746"
                                },
                                {
                                    "integerValue": "211872"
                                },
                                {
                                    "integerValue": "3626175"
                                },
                                {
                                    "integerValue": "3625847"
                                },
                                {
                                    "integerValue": "12464"
                                },
                                {
                                    "integerValue": "171822"
                                },
                                {
                                    "integerValue": "3628785"
                                },
                                {
                                    "integerValue": "3634908"
                                },
                                {
                                    "integerValue": "3640761"
                                },
                                {
                                    "integerValue": "3642561"
                                },
                                {
                                    "integerValue": "3653272"
                                },
                                {
                                    "integerValue": "3653914"
                                },
                                {
                                    "integerValue": "3653923"
                                },
                                {
                                    "integerValue": "3618628"
                                },
                                {
                                    "integerValue": "3655699"
                                },
                                {
                                    "integerValue": "3073082"
                                },
                                {
                                    "integerValue": "3504962"
                                },
                                {
                                    "integerValue": "3663001"
                                },
                                {
                                    "integerValue": "3657954"
                                },
                                {
                                    "integerValue": "3672240"
                                },
                                {
                                    "integerValue": "3701821"
                                },
                                {
                                    "integerValue": "3610859"
                                },
                                {
                                    "integerValue": "3712536"
                                },
                                {
                                    "integerValue": "3710750"
                                },
                                {
                                    "integerValue": "3723299"
                                },
                                {
                                    "integerValue": "3727962"
                                },
                                {
                                    "integerValue": "3728927"
                                },
                                {
                                    "integerValue": "3736985"
                                },
                                {
                                    "integerValue": "3741066"
                                },
                                {
                                    "integerValue": "3645650"
                                },
                                {
                                    "integerValue": "3585372"
                                },
                                {
                                    "integerValue": "3678271"
                                },
                                {
                                    "integerValue": "3508892"
                                },
                                {
                                    "integerValue": "3703078"
                                },
                                {
                                    "integerValue": "260777"
                                },
                                {
                                    "integerValue": "3333888"
                                },
                                {
                                    "integerValue": "942179"
                                },
                                {
                                    "integerValue": "329436"
                                },
                                {
                                    "integerValue": "1990285"
                                },
                                {
                                    "integerValue": "2104697"
                                },
                                {
                                    "integerValue": "3744433"
                                },
                                {
                                    "integerValue": "2984165"
                                },
                                {
                                    "integerValue": "3741946"
                                },
                                {
                                    "integerValue": "3745396"
                                },
                                {
                                    "integerValue": "3763565"
                                },
                                {
                                    "integerValue": "1127672"
                                },
                                {
                                    "integerValue": "3497812"
                                },
                                {
                                    "integerValue": "3768879"
                                },
                                {
                                    "integerValue": "302460"
                                },
                                {
                                    "integerValue": "3629260"
                                },
                                {
                                    "integerValue": "3770124"
                                },
                                {
                                    "integerValue": "3785781"
                                },
                                {
                                    "integerValue": "3752138"
                                },
                                {
                                    "integerValue": "3626077"
                                },
                                {
                                    "integerValue": "3794559"
                                },
                                {
                                    "integerValue": "3796868"
                                },
                                {
                                    "integerValue": "3758647"
                                },
                                {
                                    "integerValue": "3802347"
                                },
                                {
                                    "integerValue": "3796328"
                                },
                                {
                                    "integerValue": "3806160"
                                },
                                {
                                    "integerValue": "3806160"
                                },
                                {
                                    "integerValue": "3702013"
                                },
                                {
                                    "integerValue": "3795707"
                                },
                                {
                                    "integerValue": "3821630"
                                },
                                {
                                    "integerValue": "3822150"
                                },
                                {
                                    "integerValue": "2892112"
                                },
                                {
                                    "integerValue": "3807358"
                                },
                                {
                                    "integerValue": "229130"
                                },
                                {
                                    "integerValue": "3626699"
                                },
                                {
                                    "integerValue": "3834512"
                                },
                                {
                                    "integerValue": "3836280"
                                },
                                {
                                    "integerValue": "3839488"
                                },
                                {
                                    "integerValue": "3801614"
                                },
                                {
                                    "integerValue": "3825722"
                                },
                                {
                                    "integerValue": "3844604"
                                },
                                {
                                    "integerValue": "3843133"
                                },
                                {
                                    "integerValue": "3845579"
                                },
                                {
                                    "integerValue": "3855418"
                                },
                                {
                                    "integerValue": "3861085"
                                },
                                {
                                    "integerValue": "3501697"
                                },
                                {
                                    "integerValue": "3874538"
                                },
                                {
                                    "integerValue": "3875634"
                                },
                                {
                                    "integerValue": "3792690"
                                },
                                {
                                    "integerValue": "3801716"
                                },
                                {
                                    "integerValue": "1311343"
                                },
                                {
                                    "integerValue": "3830812"
                                },
                                {
                                    "integerValue": "3875851"
                                },
                                {
                                    "integerValue": "3838682"
                                },
                                {
                                    "integerValue": "3725749"
                                },
                                {
                                    "integerValue": "3882027"
                                },
                                {
                                    "integerValue": "3458284"
                                },
                                {
                                    "integerValue": "3888303"
                                }
                            ]
                        }
                    },
                    "categoryIdList": {
                        "arrayValue": {
                            "values": [
                                {
                                    "stringValue": "289"
                                },
                                {
                                    "stringValue": "291"
                                },
                                {
                                    "stringValue": "292"
                                },
                                {
                                    "stringValue": "293"
                                },
                                {
                                    "stringValue": "294"
                                },
                                {
                                    "stringValue": "387"
                                },
                                {
                                    "stringValue": "389"
                                },
                                {
                                    "stringValue": "390"
                                },
                                {
                                    "stringValue": "391"
                                },
                                {
                                    "stringValue": "392"
                                },
                                {
                                    "stringValue": "395"
                                },
                                {
                                    "stringValue": "399"
                                },
                                {
                                    "stringValue": "400"
                                },
                                {
                                    "stringValue": "401"
                                },
                                {
                                    "stringValue": "402"
                                },
                                {
                                    "stringValue": "441"
                                },
                                {
                                    "stringValue": "442"
                                },
                                {
                                    "stringValue": "444"
                                },
                                {
                                    "stringValue": "445"
                                },
                                {
                                    "stringValue": "1011"
                                },
                                {
                                    "stringValue": "1020"
                                },
                                {
                                    "stringValue": "1022"
                                },
                                {
                                    "stringValue": "1023"
                                }
                            ]
                        }
                    }
                }
            }
        },
        " restrictedCategories_android": {
            "arrayValue": {
                "values": [
                    {
                        "integerValue": "289"
                    },
                    {
                        "integerValue": "291"
                    },
                    {
                        "integerValue": "292"
                    },
                    {
                        "integerValue": "293"
                    },
                    {
                        "integerValue": "294"
                    },
                    {
                        "integerValue": "387"
                    },
                    {
                        "integerValue": "389"
                    },
                    {
                        "integerValue": "390"
                    },
                    {
                        "integerValue": "391"
                    },
                    {
                        "integerValue": "392"
                    },
                    {
                        "integerValue": "395"
                    },
                    {
                        "integerValue": "399"
                    },
                    {
                        "integerValue": "400"
                    },
                    {
                        "integerValue": "401"
                    },
                    {
                        "integerValue": "402"
                    },
                    {
                        "integerValue": "441"
                    },
                    {
                        "integerValue": "442"
                    },
                    {
                        "integerValue": "444"
                    },
                    {
                        "integerValue": "445"
                    },
                    {
                        "integerValue": "446"
                    },
                    {
                        "integerValue": "447"
                    },
                    {
                        "integerValue": "1011"
                    },
                    {
                        "integerValue": "1020"
                    },
                    {
                        "integerValue": "1022"
                    },
                    {
                        "integerValue": "1023"
                    }
                ]
            }
        },
        "launcherBroadcast": {
            "stringValue": "false"
        },
        "categoryParentControl": {
            "mapValue": {
                "fields": {
                    "data": {
                        "arrayValue": {
                            "values": [
                                {
                                    "integerValue": "289"
                                },
                                {
                                    "integerValue": "291"
                                },
                                {
                                    "integerValue": "292"
                                },
                                {
                                    "integerValue": "293"
                                },
                                {
                                    "integerValue": "294"
                                },
                                {
                                    "integerValue": "387"
                                },
                                {
                                    "integerValue": "389"
                                },
                                {
                                    "integerValue": "390"
                                },
                                {
                                    "integerValue": "391"
                                },
                                {
                                    "integerValue": "392"
                                },
                                {
                                    "integerValue": "395"
                                },
                                {
                                    "integerValue": "399"
                                },
                                {
                                    "integerValue": "401"
                                },
                                {
                                    "integerValue": "402"
                                },
                                {
                                    "integerValue": "441"
                                },
                                {
                                    "integerValue": "442"
                                },
                                {
                                    "integerValue": "444"
                                },
                                {
                                    "integerValue": "445"
                                },
                                {
                                    "integerValue": "446"
                                },
                                {
                                    "integerValue": "447"
                                },
                                {
                                    "integerValue": "1011"
                                },
                                {
                                    "integerValue": "1020"
                                },
                                {
                                    "integerValue": "1022"
                                },
                                {
                                    "integerValue": "1023"
                                }
                            ]
                        }
                    },
                    "count": {
                        "integerValue": "24"
                    }
                }
            }
        }
    },
    "createTime": "2021-05-17T07:47:01.557304Z",
    "updateTime": "2022-06-20T04:02:34.683275Z"
}"""
    val parsedData = FirestoreResponse.parse(jsonData)
    println(parsedData)

}

