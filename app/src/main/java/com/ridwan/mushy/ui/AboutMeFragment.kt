package com.ridwan.mushy.ui

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ridwan.mushy.R
import com.ridwan.mushy.databinding.FragmentAboutMeBinding


class AboutMeFragment : Fragment() {
   lateinit var binding: FragmentAboutMeBinding

   override fun onCreateView(
      inflater: LayoutInflater, container: ViewGroup?,
      savedInstanceState: Bundle?
   ): View? {
      // Inflate the layout for this fragment
      return inflater.inflate(R.layout.fragment_about_me, container, false)
   }

   override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
      super.onViewCreated(view, savedInstanceState)
      binding = FragmentAboutMeBinding.bind(view)
      binding.cardviewGithubProfile.setOnClickListener {
         val url = "https://github.com/autorunsid"
         val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
         startActivity(intent)
      }
   }

}