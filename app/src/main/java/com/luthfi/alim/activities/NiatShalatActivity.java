package com.luthfi.alim.activities;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.luthfi.alim.R;

public class NiatShalatActivity extends AppCompatActivity {
   ListView NiatShalatList;
   String [] niatShalat = {
           "Niat Shalat Subuh",
           "Niat Shalat Zhuhur",
           "Niat Shalat Ashar",
           "Niat Shalat Maghrib",
           "Niat Shalat Isya"
   };

   String [] arabNiat = {
           "أُصَلِّى فَرْضَ الصُّبْح رَكَعتَيْنِ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لله تَعَالَى\n",
           "اُصَلِّيْ فَرْضَ الظُّهْرِ أَرْبَعَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لله تَعَالَى\n",
           "أُصَلِّى فَرْضَ العَصْرِأَرْبَعَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لله تَعَالَى\n",
           "أُصَلِّى فَرْضَ المَغْرِبِ ثَلاَثَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لله تَعَالَ\n",
           "أُصَلِّى فَرْضَ العِشَاء ِأَرْبَعَ رَكَعاَتٍ مُسْتَقْبِلَ الْقِبْلَةِ أَدَاءً لله تَعَالَى\n"
   };

   String [] latina = {
           "\nUsholli Fardlon Shubhi Rok'ataini Mustaqbilal Qiblati Adaa-an Lillahi ta'aala",
           "\nUsholli Fardlon dhuhri Arba'a Rok'aataim Mustaqbilal Qiblati Adaa-an Lillahi ta'aala",
           "\nUsholli Fardlol Ashri Arba'a Roka'aataim Mustaqbilal Qiblati Adaa-an Lillahi ta'aala",
           "\nUsholli Fardlol Maghribi Tsalaatsa Roka'aataim Mustaqbilal Qiblati Adaa-an Lillahi ta'aala\n",
           "\nUsholli Fardlol I'syaa-i Arba'a Roka'aataim Mustaqbilal Qiblati Adaa-an Lillahi ta'aala\n"
   };

   String [] translate = {
           "\nAku niat melakukan sholat fardu subuh 2 rakaat, sambil menghadap qiblat, saat ini, karena Allah ta'ala",
           "\nAku niat melakukan sholat fardu dhuhur 4 rakaat, sambil menghadap qiblat, saat ini, karena Allah ta'ala",
           "\nAku niat melakukan sholat fardu ashar 4 rakaat, sambil menghadap qiblat, saat ini, karena Allah ta'ala",
           "\nAku niat melakukan sholat fardu maghrib 3 rakaat, sambil menghadap qiblat, saat ini, karena Allah ta'ala\n",
           "\nAku niat melakukan sholat fardu isya 4 rakaat, sambil menghadap qiblat, saat ini, karena Allah ta'ala\n"
   };

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_niat_shalat);

      NiatShalatList = findViewById(R.id.niatListView);

      NiatShalatList = (ListView) findViewById(R.id.niatListView);
      NiatShalatAdapter NSA = new NiatShalatAdapter(getApplicationContext(), niatShalat, arabNiat, latina, translate);
      NiatShalatList.setAdapter(NSA);
   }

}
