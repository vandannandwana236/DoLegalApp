package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivityStoryBinding
import java.util.zip.Inflater

class StoryActivity : AppCompatActivity() {
    private var count = 0;
    private lateinit var list:ArrayList<StoryModel>
    private lateinit var binding: ActivityStoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList<StoryModel>()
        list.add(StoryModel("Ek samay ki baat hain . Ek gav main do bahut ganisht mitra the jinme se ek ka naam Abhi aur dusre ka naam Raju tha . Abhi jaha bahut padhi likhi family se tha vahi Raju bahut garib aur anpadh pariwar se tha . Ve dono bahut aache dost the aur hamesha ve dono saath rehna saath khelna pasand karte the.",R.drawable.twofriend))
        list.add(StoryModel("Ve dono apne is jiwan se bahut khush the. Roj veh maidan me khelne jate the par kuch dino se Raju maidan main khelne nahi aa raha tha aur uske ghar par puchne par bhi koi jawab Abhi ko nahi mila jiske baad . Abhi bahut udas ho gaya aur ghar jane laga . Aaj waha roj wale raste ko chod kisi aur raste se ghar ja raha tha jo ki ek purani glass factory ke paas se hokar nikalta tha .",R.drawable.alone))
        list.add(StoryModel("Jab Abhi vaha se jaa raha tha toh usne ek bacche ki rone ki awaj suni. Usne suna ki waha aawaj us factoy se aa rahi hain. Usne ek khidki se uss factory main jhak kar dekha toh paya ki waha bahut se jane kaam kar rahe hain aur jab usne apni nazar gumai toh dekha ki ek aadmi ek bacche ko uski galti pr maar raha h aur use aag ki Bhatti main kaam karwa raha hain.\n",R.drawable.shout))
        list.add(StoryModel("Abhi toh tab chok gaya jab usne dekha ki voh bacha aur koi nahi uska dost Raju hi tha Voh kuch sochta ki use pehle use apne kandhe par ek haat mehsus hua aur voh haath use use factory ke andar khich raha tha Abhi jitni takat laga sakta tha usne lagai aur vaha se bhag gaya . Andhere ki wajah se voh dekh toh nahi paya ki voh haath kiska tha pr uss samay vaha se bhagna hi uske liye sabse behtar rasta tha\n",R.drawable.boy_work))
        list.add(StoryModel("Abhi jald se jald ghar pohocha aur sari baat apne mata pita ko batai aur uske mata pita ne bhi puri baat bahut vistaar main suni aur uss factory main jane ka nirnay liya . Abhi mata pita dono graduate the isliye unhone iss baat ko aise hi jane nahi diya .",R.drawable.run))
        list.add(StoryModel("Agle hi din Abhi ke mata pita uss factory pauche aur vaha ke manager se baat ki .Uske mata pita ne manager se kaha ki aap jo bhi kr rahe ho vah kanooni apradh hain iski wajah se aapko jail bhi ho sakti hain.\n",R.drawable.talktofamily))
        list.add(StoryModel("Toh manager ne thoda gussa hokar kaha ki main nahi rakhta inko kaam par inke mata pita chod kar jate hain inhe yaha main toh aur inka bhala hi kar raha hu . Abhi ke mata pita ne kaha ki fir bhi aap itne chote bacche se kaam nahi karwa sakte yaha galat hain. Manager ne kaha ki samjhana hi hain toh inke mata pita ko samjhao jo inhe yaha chod kar jate hain.",R.drawable.angry))
        list.add(StoryModel("Iske baad Abhi ke mata pita Raju ke ghar jate hain. Aur vaha ve Raju ki mummy se milte hain. Aur unse puchte hain ki aap apne bacche ko us factory main kyu bhejte hain kya aapko pata nahi ki kisi bacche ko kaam par bhejna kanooni apradh hain. Toh Raju ki maa roti roti kehti hain ki main kya kru iske pita ka 3 din pehle hi dehant hua hain aur humare upar uss manager ka karza hain jiski wajah se mujhe Raju ko na chahte hue bhi vaha kaam karne ke liye bhejna padta hain.\n Nahi toh…",R.drawable.maa))
        list.add(StoryModel("Nahi toh vaha hum dono ko maar dene ki dhamki deta hain. Abhi ke pita bolte hain toh aapko police main complaint karni chahiye . Toh Raju ki maa bolti hain ki hum chote logo ki baato pr koi dhyaan nahi deta sahab humare saath raste par pade kachre ki tarah bartav kia jata hain.\n",R.drawable.kill))
        list.add(StoryModel("Abhi ke pita ki police main aachi jaan pehchan thi toh unhone yeh sab baat police main batayi aur thodi hi der main police Raju ke ghar ke bahar aa gai. Fir ve sab milkar glass factory ke manager ke paas gaye aur police ne manager ko giraftar kar liya aur kaha......",R.drawable.police))
        list.add(StoryModel("Tumhe pata nahi hain ki section 1986 ke anusar tum kisi 14 saal ya usse chote bacche se aisa koi kaam nahi karwa sakte jime unhe kisi bhi tarah ka nuksan ho raha ho . Aur yaha tum is bacche se kaanch ka karwa rahe ho, Agar kabhi voh garam garam kach iss par gir gaya toh uska jimmevar kon rahega. Koi baat nahi thoda samay jail main rahoge toh sab samajh aa jayega.",R.drawable.arrest))
        list.add(StoryModel("Fir police manager ko lekar waha se chali gai. Abhi ki mummy ne ek tailor ke yaha Raju ki maa ko nokri bhi dilwa di jiski wajah se unka guzara aache se hone lag gaya tha.\n \n                 THE END",R.drawable.job))
        binding.sImage.setImageResource(list[0].s_image)
        binding.sText.text = list[0].s_text
        binding.sNext.setOnClickListener{
            count++;
            if(count<list.size){
                binding.sImage.setImageResource(list[count].s_image)
                binding.sText.text = list[count].s_text
            }
            if(count==list.size){
                count = list.size-1
                val intent=Intent(this@StoryActivity,QuizStartActivity::class.java)
                startActivity(intent)
            }
        }
        binding.sPrev.setOnClickListener{
            if(count>0){
                count--
                binding.sImage.setImageResource(list[count].s_image)
                binding.sText.text=list[count].s_text
            }
            else{
                Toast.makeText(this,"This is first page",Toast.LENGTH_SHORT).show()
            }
        }




    }
}