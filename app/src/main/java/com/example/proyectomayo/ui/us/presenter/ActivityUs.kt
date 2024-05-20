package com.example.proyectomayo.ui.us.presenter
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.proyectomayo.data.service.response.local.provider.MemberProvider
import com.example.proyectomayo.data.service.response.local.provider.UsProvider
import com.example.proyectomayo.databinding.ActivityUsBinding
import com.example.proyectomayo.ui.home.presenter.ActivityHome
import com.example.proyectomayo.ui.us.adapter.MembersAdapter
import com.example.proyectomayo.ui.us.adapter.UsAdapter

class ActivityUs : AppCompatActivity() {
    private lateinit var binding: ActivityUsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initRecyclerUs()
        initRecyclerMembers()


        binding.ivBack.setOnClickListener{ navigateToHome()}






    }
    fun initRecyclerUs(){
        val usAdapter = UsAdapter(UsProvider.getImageUs())
        binding.recyclerUs.adapter = usAdapter
    }
    fun initRecyclerMembers(){
        val membersAdapter = MembersAdapter(MemberProvider.getMember())
        binding.recyclerMembers.adapter = membersAdapter
    }
     fun navigateToHome(){
        val intent = Intent(this, ActivityHome::class.java)
         startActivity(intent)
    }

}