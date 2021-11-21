package com.jo.lolbox

import androidx.recyclerview.widget.RecyclerView

import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.jo.json.R
import java.util.*
class item(val name:String,val box:String,val level:Int,val point:Int)
class recyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cham: ImageView = itemView.findViewById<View>(R.id.img) as ImageView
        var box: ImageView = itemView.findViewById<View>(R.id.box) as ImageView
        var level: ImageView = itemView.findViewById<View>(R.id.level) as ImageView
        var name: TextView = itemView.findViewById<View>(R.id.name) as TextView
        var text: TextView = itemView.findViewById<View>(R.id.text) as TextView
        var exp: TextView = itemView.findViewById<View>(R.id.exp) as TextView
}
class adapter(private val list: ArrayList<item>) : RecyclerView.Adapter<recyclerViewHolder>() {
    private var arrayList2 =arrayListOf(
            R.drawable.garen,
            R.drawable.galio,
            R.drawable.gangplank,
            R.drawable.gragas,
            R.drawable.graves,
            R.drawable.gwen,
            R.drawable.gnar,
            R.drawable.nami,
            R.drawable.nasus,
            R.drawable.nautilus,
            R.drawable.nocturne,
            R.drawable.nunu,
            R.drawable.nidalee,
            R.drawable.neeko,
            R.drawable.darius,
            R.drawable.diana,
            R.drawable.draven,
            R.drawable.ryze,
            R.drawable.rakan,
            R.drawable.rammus,
            R.drawable.lux,
            R.drawable.rumble,
            R.drawable.renekton,
            R.drawable.leona,
            R.drawable.reksai,
            R.drawable.rell,
            R.drawable.rengar,
            R.drawable.lucian,
            R.drawable.lulu,
            R.drawable.leblanc,
            R.drawable.leesin,
            R.drawable.riven,
            R.drawable.lissandra,
            R.drawable.lillia,
            R.drawable.masteryi,
            R.drawable.maokai,
            R.drawable.malzahar,
            R.drawable.malphite,
            R.drawable.mordekaiser,
            R.drawable.morgana,
            R.drawable.drmundo,
            R.drawable.missfortune,
            R.drawable.bard,
            R.drawable.varus,
            R.drawable.vi,
            R.drawable.veigar,
            R.drawable.vayne,
            R.drawable.zz,
            R.drawable.velkoz,
            R.drawable.volibear,
            R.drawable.braum,
            R.drawable.brand,
            R.drawable.vladimir,
            R.drawable.blitzcrank,
            R.drawable.viego,
            R.drawable.viktor,
            R.drawable.poppy,
            R.drawable.samira,
            R.drawable.sion,
            R.drawable.sylas,
            R.drawable.shaco,
            R.drawable.senna,
            R.drawable.seraphine,
            R.drawable.sejuani,
            R.drawable.sett,
            R.drawable.sona,
            R.drawable.soraka,
            R.drawable.shen,
            R.drawable.shyvana,
            R.drawable.swain,
            R.drawable.skarner,
            R.drawable.sivir,
            R.drawable.xinzhao,
            R.drawable.syndra,
            R.drawable.singed,
            R.drawable.thresh,
            R.drawable.ahri,
            R.drawable.amumu,
            R.drawable.aurelionsol,
            R.drawable.ivern,
            R.drawable.azir,
            R.drawable.akali,
            R.drawable.akshan,
            R.drawable.aatrox,
            R.drawable.aphelios,
            R.drawable.alistar,
            R.drawable.annie,
            R.drawable.anivia,
            R.drawable.ashe,
            R.drawable.yasuo,
            R.drawable.ekko,
            R.drawable.elise,
            R.drawable.monkeyking,
            R.drawable.ornn,
            R.drawable.orianna,
            R.drawable.olaf,
            R.drawable.yone,
            R.drawable.yorick,
            R.drawable.udyr,
            R.drawable.urgot,
            R.drawable.warwick,
            R.drawable.yuumi,
            R.drawable.irelia,
            R.drawable.evelynn,
            R.drawable.ezreal,
            R.drawable.illaoi,
            R.drawable.jarvan4,
            R.drawable.xayah,
            R.drawable.zyra,
            R.drawable.zac,
            R.drawable.janna,
            R.drawable.jax,
            R.drawable.zed,
            R.drawable.xerath,
            R.drawable.jayce,
            R.drawable.zoe,
            R.drawable.ziggs,
            R.drawable.jhin,
            R.drawable.zilean,
            R.drawable.jinx,
            R.drawable.chogath,
            R.drawable.karma,
            R.drawable.camille,
            R.drawable.kassadin,
            R.drawable.karthus,
            R.drawable.cassiopeia,
            R.drawable.kaisa,
            R.drawable.khazix,
            R.drawable.katarina,
            R.drawable.kalista,
            R.drawable.kennen,
            R.drawable.caitlyn,
            R.drawable.kayn,
            R.drawable.kayle,
            R.drawable.kogmaw,
            R.drawable.corki,
            R.drawable.quinn,
            R.drawable.kled,
            R.drawable.qiyana,
            R.drawable.kindred,
            R.drawable.taric,
            R.drawable.talon,
            R.drawable.taliyah,
            R.drawable.tahmkench,
            R.drawable.trundle,
            R.drawable.tristana,
            R.drawable.tryndamere,
            R.drawable.twistedfate,
            R.drawable.twitch,
            R.drawable.teemo,
            R.drawable.pyke,
            R.drawable.pantheon,
            R.drawable.fiddlesticks,
            R.drawable.fiora,
            R.drawable.fizz,
            R.drawable.heimerdinger,
            R.drawable.hecarim
        )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return recyclerViewHolder(view)
    }
    override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {

            holder.name.text = list[position].name
            holder.cham.setImageResource(arrayList2[arrayList.indexOf(list[position].name)])
            holder.exp.text = list[position].point.toString()+"점"
            if (list[position].level == 1) {
                    holder.level.setImageResource(R.drawable.level1)
            }
            if (list[position].level == 2) {
                    holder.level.setImageResource(R.drawable.level2)
            }
            if (list[position].level == 3) {
                    holder.level.setImageResource(R.drawable.level3)
            }
            if (list[position].level == 4) {
                    holder.level.setImageResource(R.drawable.level4)
            }
            if (list[position].level == 5) {
                    holder.level.setImageResource(R.drawable.level5)
            }
            if (list[position].level == 6) {
                    holder.level.setImageResource(R.drawable.level6)
            }
            if (list[position].level == 7) {
                    holder.level.setImageResource(R.drawable.level7)
            }
            if (list[position].box == "true") {
                    holder.text.text = "상자 획득 완료"
                    holder.box.setImageResource(R.drawable.boxo)
            } else {
                holder.text.text = "상자 미획득"
                    holder.box.setImageResource(R.drawable.boxp)
            }
    }

    override fun getItemCount(): Int {
        return list.size
    }


    companion object {
        @JvmField
        var arrayList = arrayListOf(
                "가렌",
                "갈리오",
                "갱플랭크",
                "그라가스",
                "그레이브즈",
                "그웬",
                "나르",
                "나미",
                "나서스",
                "노틸러스",
                "녹턴",
                "누누와윌럼프",
                "니달리",
                "니코",
                "다리우스",
                "다이애나",
                "드레이븐",
                "라이즈",
                "라칸",
                "람머스",
                "럭스",
                "럼블",
                "레넥톤",
                "레오나",
                "렉사이",
                "렐",
                "렝가",
                "루시안",
                "룰루",
                "르블랑",
                "리신",
                "리븐",
                "리산드라",
                "릴리아",
                "마스터이",
                "마오카이",
                "말자하",
                "말파이트",
                "모데카이저",
                "모르가나",
                "문도박사",
                "미스포츈",
                "바드",
                "바루스",
                "바이",
                "베이가",
                "베인",
                "벡스",
                "벨코즈",
                "볼리베어",
                "브라움",
                "브랜드",
                "블라디미르",
                "블리츠크랭크",
                "비에고",
                "빅토르",
                "뽀삐",
                "사미라",
                "사이온",
                "사일러스",
                "샤코",
                "세나",
                "세라핀",
                "세주아니",
                "세트",
                "소나",
                "소라카",
                "쉔",
                "쉬바나",
                "스웨인",
                "스카너",
                "시비르",
                "신짜오",
                "신드라",
                "신지드",
                "쓰레쉬",
                "아리",
                "아무무",
                "아우렐리온 솔",
                "아이번",
                "아지르",
                "아칼리",
                "아크샨",
                "아트록스",
                "아펠리오스",
                "알리스타",
                "애니",
                "애니비아",
                "애쉬",
                "야스오",
                "에코",
                "엘리스",
                "오공",
                "오른",
                "오리아나",
                "올라프",
                "요네",
                "요릭",
                "우디르",
                "우르곳",
                "워윅",
                "유미",
                "이렐리아",
                "이블린",
                "이즈리얼",
                "일라오이",
                "자르반4세",
                "자야",
                "자이라",
                "자크",
                "잔나",
                "잭스",
                "제드",
                "제라스",
                "제이스",
                "조이",
                "직스",
                "진",
                "질리언",
                "징크스",
                "초가스",
                "카르마",
                "카밀",
                "카사딘",
                "카서스",
                "카시오페아",
                "카이사",
                "카직스",
                "카타리나",
                "칼리스타",
                "케넨",
                "케이틀린",
                "케인",
                "케일",
                "코그모",
                "코르키",
                "퀸",
                "클레드",
                "키아나",
                "킨드레드",
                "타릭",
                "탈론",
                "탈리야",
                "탐 켄치",
                "트런들",
                "트리스타나",
                "트린다미어",
                "트위스티드페이트",
                "트위치",
                "티모",
                "파이크",
                "판테온",
                "피들스틱",
                "피오라",
                "피즈",
                "하이머딩거",
                "헤카림"
            )
    }
}