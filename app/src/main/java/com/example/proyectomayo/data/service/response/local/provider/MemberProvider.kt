package com.example.proyectomayo.data.service.response.local.provider

import com.example.proyectomayo.data.dto.response.MemberResponse
import com.example.proyectomayo.data.dto.response.UsResponse

class MemberProvider {
    companion object{
        fun getMember(): List<MemberResponse> {
            return listOf(
                MemberResponse(name = "Ricardo Soto: Desarrollador Android Junior",
                    image = "https://z-p3-scontent.fscl25-1.fna.fbcdn.net/v/t39.30808-6/319752281_1226513101408919_6415640321846121098_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHw4i1WqxGvNdQph-rAx2lf2rP0boV95oDas_RuhX3mgOAjs9IVKgofIlPXMJfgNgSxP80Ws-u_4WFT_oNh6oU9&_nc_ohc=Y7XL3PO2YtMQ7kNvgFr0OBl&_nc_zt=23&_nc_ht=z-p3-scontent.fscl25-1.fna&oh=00_AYDRWWvxG5uYppGPom2uOvnla4hovJHRTGnP08hFr3mhWw&oe=66504922"),
                MemberResponse(name = "juanito peres",
                    image = "https://z-p3-scontent.fscl25-1.fna.fbcdn.net/v/t39.30808-6/319752281_1226513101408919_6415640321846121098_n.jpg?_nc_cat=101&ccb=1-7&_nc_sid=5f2048&_nc_eui2=AeHw4i1WqxGvNdQph-rAx2lf2rP0boV95oDas_RuhX3mgOAjs9IVKgofIlPXMJfgNgSxP80Ws-u_4WFT_oNh6oU9&_nc_ohc=Y7XL3PO2YtMQ7kNvgFr0OBl&_nc_zt=23&_nc_ht=z-p3-scontent.fscl25-1.fna&oh=00_AYDRWWvxG5uYppGPom2uOvnla4hovJHRTGnP08hFr3mhWw&oe=66504922")
            )

        }
    }
}