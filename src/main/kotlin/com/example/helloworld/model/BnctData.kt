package com.example.helloworld.model
import jakarta.persistence.*

@Entity
@Table(name = "data")
class BnctData {

    @Id
    var Polnaia_data: String? = null
    var H_Konus_mA: String? = null
    var H_Linza_Voblova_Sliv_C: String? = null

//    var H_Linza_Voblova_Napor_C: Double? = null
//    var H_Linza_Voblova_Moshchnost_Vt: Double? = null
//    var H_Linza_Voblova_Potok_l_min: Double? = null
//    var H_Napor_IFM_l_min: Double? = null
//    var H_Sliv_IFM_l_min: Double? = null
//    var H_Istochnik_Pa: Double? = null
//    var H_Diff_otkachka_Pa: Double? = null
//    var Bergoz_HEBL_Tok_mA: Double? = null
//    var Konus_1_Tok_mA: Double? = null
//    var Konus_1_Tsentr_C: Double? = null
//    var Konus_1_M_Verkh_C: Double? = null
//    var Konus_1_M_Pravo_C: Double? = null
//    var Konus_1_M_Niz_C: Double? = null
//    var Konus_1_M_Levo_C: Double? = null
//    var Konus_1_B_Verkh_C: Double? = null
//    var Konus_1_B_Pravo_C: Double? = null
//    var Konus_1_B_Niz_C: Double? = null
//    var Konus_1_B_Levo_C: Double? = null
//    var Konus_2_Tok_mA: Double? = null
//    var Konus_2_Tsentr_C: Double? = null
//    var Konus_2_M_Verkh_C: Double? = null
//    var Konus_2_M_Pravo_C: Double? = null
//    var Konus_2_M_Niz_C: Double? = null
//    var Konus_2_M_Levo_C: Double? = null
//    var Konus_2_B_Verkh_C: Double? = null
//    var Konus_2_B_Pravo_C: Double? = null
//    var Konus_2_B_Niz_C: Double? = null
//    var Konus_2_B_Levo_C: Double? = null
//    var ELV_Energiia_keV: Double? = null
//    var ELV_Beam0_mA: Double? = null
//    var ELV_EnergyU_get_kV: Double? = null
//    var ELV_EnergyU_set_kV: Double? = null
//    var ELV_EnergyI_mA: Double? = null
//    var ELV_Avarage_mA: Double? = null
//    var ELV_Sec1U_kV: Double? = null
//    var ELV_Sec1I_mA: Double? = null
//    var ELV_IsolatorU_kV: Double? = null
//    var ELV_IsolatorI_mA: Double? = null
//    var ELV_Dark_mA: Double? = null
//    var Okhl_diaf_1_Verkh_C: Double? = null
//    var Okhl_diaf_1_Pravo_C: Double? = null
//    var Okhl_diaf_1_Niz_C: Double? = null
//    var Okhl_diaf_1_Levo_C: Double? = null
//    var Okhl_diaf_2_Verkh_C: Double? = null
//    var Okhl_diaf_2_Pravo_C: Double? = null
//    var Okhl_diaf_2_Niz_C: Double? = null
//    var Okhl_diaf_2_Levo_C: Double? = null
//    var Okhl_diaf_3_Verkh_C: Double? = null
//    var Okhl_diaf_3_Pravo_C: Double? = null
//    var Okhl_diaf_3_Niz_C: Double? = null
//    var Okhl_diaf_3_Levo_C: Double? = null
//    var Okhl_diaf_4_Verkh_C: Double? = null
//    var Okhl_diaf_4_Pravo_C: Double? = null
//    var Okhl_diaf_4_Niz_C: Double? = null
//    var Okhl_diaf_4_Levo_C: Double? = null
//    var Okhl_diaf_5_Verkh_C: Double? = null
//    var Okhl_diaf_5_Pravo_C: Double? = null
//    var Okhl_diaf_5_Niz_C: Double? = null
//    var Okhl_diaf_5_Levo_C: Double? = null
//    var Li_mishen_Tok_mA: Double? = null
//    var Li_mishen_Tsentr_0_C: Double? = null
//    var Li_mishen_Niz_pravo_1_C: Double? = null
//    var Li_mishen_Pravo_2_C: Double? = null
//    var Li_mishen_Verkh_pravo_3_C: Double? = null
//    var Li_mishen_Verkh_4_C: Double? = null
//    var Li_mishen_Verkh_levo_5_C: Double? = null
//    var Li_mishen_Levo_6_C: Double? = null
//    var Li_mishen_Niz_levo_7_C: Double? = null
//    var Li_mishen_Voda_vkhod_l_min: Double? = null
//    var Li_mishen_Voda_vykhod_1_l_min: Double? = null
//    var Li_mishen_Voda_vykhod_2_l_min: Double? = null
//    var Li_mishen_Vakuum_Pa: Double? = null
//    var Li_mishen_9_Tsentr_0_C: Double? = null
//    var Li_mishen_9_M_Pravo_1_C: Double? = null
//    var Li_mishen_9_B_Pravo_2_C: Double? = null
//    var Li_mishen_9_M_Verkh_3_C: Double? = null
//    var Li_mishen_9_B_Verkh_4_C: Double? = null
//    var Li_mishen_9_M_Levo_5_C: Double? = null
//    var Li_mishen_9_B_Levo_6_C: Double? = null
//    var Li_mishen_9_M_Niz_7_C: Double? = null
//    var Li_mishen_9_B_Niz_8_C: Double? = null
//    var Bop_1M_B2_Zal_Gamma_Zv_Ch: Double? = null
//    var Bop_1M_B2_Zal_Neitrony_Zv_Ch: Double? = null
//    var Bop_1M_B2_Kor_Gamma_Zv_Ch: Double? = null
//    var Bop_1M_B2_Kor_Neitrony_Zv_Ch: Double? = null
//    var Bop_1M_B3_Zal_Gamma_Zv_Ch: Double? = null
//    var Bop_1M_B3_Zal_Neitrony_Zv_Ch: Double? = null
//    var Bop_1M_B3_Kor_Gamma_Zv_Ch: Double? = null
//    var Bop_1M_B3_Kor_Neitrony_Zv_Ch: Double? = null
//    var Li6_Neitrony_sht_sek: Double? = null
//    var Li6_Gamma_sht_sek: Double? = null
//    var Li6_Zagruzka_persent: Double? = null
//    var Li6_Integral_neitronov_sht: Double? = null
//    var Eff_obdirki_Neitraly_I_mA: Double? = null
//    var Eff_obdirki_Eff_persent: Double? = null
//    var UltravoltPs_300V_U_set_V: Double? = null
//    var UltravoltPs_300V_I_set_mA: Double? = null
//    var UltravoltPs_300V_U_get_V: Double? = null
//    var UltravoltPs_300V_I_get_mA: Double? = null
//    var BDN_A_n_sht_sek: Double? = null
//    var BDN_A_g_sht_sek: Double? = null
//    var BDN_A_gn_sht_sek: Double? = null
//    var BDN_A_gSv_Zv_Ch: Double? = null
//    var BDN_A_nSv_Zv_Ch: Double? = null
//    var BDN_B_n_sht_sek: Double? = null
//    var BDN_B_g_sht_sek: Double? = null
//    var BDN_B_gn_sht_sek: Double? = null
//    var BDN_B_gSv_Zv_Ch: Double? = null
//    var BDN_B_nSv_Zv_Ch: Double? = null
//    var BDN_C_n_sht_sek: Double? = null
//    var BDN_C_g_sht_sek: Double? = null
//    var BDN_C_gn_sht_sek: Double? = null
//    var BDN_C_gSv_Zv_Ch: Double? = null
//    var BDN_C_nSv_Zv_Ch: Double? = null
//    var Obdir_mish_Sliv_C: Double? = null
//    var Obdir_mish_Napor_C: Double? = null
//    var Obdir_mish_Moshchnost_Vt: Double? = null
//    var Obdir_mish_Potok_l_min: Double? = null
//    var Obdir_mish_Argon: Double? = null
//    var HPGe_Mertvoe_vremia_persent: Double? = null
//    var HPGe_Skorost_v_integrale_sht_sek: Double? = null
//    var HPGe_Integral_sht: Double? = null
//    var Vychisliator_fliuensa_Bergoz_HEBL_Tok_Fliuens_mAch: Double? = null
//    var Vychisliator_fliuensa_ELV_Beam0_Fliuens_mAch: Double? = null
//    var Vychisliator_fliuensa_Bop_1M_B2_Zal_Gamma_Fliuens_mAch: Double? = null
//    var Vychisliator_fliuensa_Bop_1M_B2_Zal_Neitrony_Fliuens_mAch: Double? = null
//    var Vychisliator_fliuensa_Li6_Neitrony_Fliuens_mAch: Double? = null
//    var Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Sliv_C: Double? = null
//    var Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Napor_C: Double? = null
//    var Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Moshchnost_Vt: Double? = null
//    var Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Potok_l_min: Double? = null
//    var Vakuum_Uskoritel_vykhod_Pa: Double? = null
//    var Vakuum_HEBL_Posle_razvertki_Pa: Double? = null
//    var operatorPcDT: String? = null
//    var journal: String? = null

    constructor() {}

    constructor(
        Polnaia_data: String?,
        H_Konus_mA: String?,
        H_Linza_Voblova_Sliv_C: String?
//        H_Linza_Voblova_Napor_C: Double?,
//        H_Linza_Voblova_Moshchnost_Vt: Double?,
//        H_Linza_Voblova_Potok_l_min: Double?,
//        H_Napor_IFM_l_min: Double?,
//        H_Sliv_IFM_l_min: Double?,
//        H_Istochnik_Pa: Double?,
//        H_Diff_otkachka_Pa: Double?,
//        Bergoz_HEBL_Tok_mA: Double?,
//        Konus_1_Tok_mA: Double?,
//        Konus_1_Tsentr_C: Double?,
//        Konus_1_M_Verkh_C: Double?,
//        Konus_1_M_Pravo_C: Double?,
//        Konus_1_M_Niz_C: Double?,
//        Konus_1_M_Levo_C: Double?,
//        Konus_1_B_Verkh_C: Double?,
//        Konus_1_B_Pravo_C: Double?,
//        Konus_1_B_Niz_C: Double?,
//        Konus_1_B_Levo_C: Double?,
//        Konus_2_Tok_mA: Double?,
//        Konus_2_Tsentr_C: Double?,
//        Konus_2_M_Verkh_C: Double?,
//        Konus_2_M_Pravo_C: Double?,
//        Konus_2_M_Niz_C: Double?,
//        Konus_2_M_Levo_C: Double?,
//        Konus_2_B_Verkh_C: Double?,
//        Konus_2_B_Pravo_C: Double?,
//        Konus_2_B_Niz_C: Double?,
//        Konus_2_B_Levo_C: Double?,
//        ELV_Energiia_keV: Double?,
//        ELV_Beam0_mA: Double?,
//        ELV_EnergyU_get_kV: Double?,
//        ELV_EnergyU_set_kV: Double?,
//        ELV_EnergyI_mA: Double?,
//        ELV_Avarage_mA: Double?,
//        ELV_Sec1U_kV: Double?,
//        ELV_Sec1I_mA: Double?,
//        ELV_IsolatorU_kV: Double?,
//        ELV_IsolatorI_mA: Double?,
//        ELV_Dark_mA: Double?,
//        Okhl_diaf_1_Verkh_C: Double?,
//        Okhl_diaf_1_Pravo_C: Double?,
//        Okhl_diaf_1_Niz_C: Double?,
//        Okhl_diaf_1_Levo_C: Double?,
//        Okhl_diaf_2_Verkh_C: Double?,
//        Okhl_diaf_2_Pravo_C: Double?,
//        Okhl_diaf_2_Niz_C: Double?,
//        Okhl_diaf_2_Levo_C: Double?,
//        Okhl_diaf_3_Verkh_C: Double?,
//        Okhl_diaf_3_Pravo_C: Double?,
//        Okhl_diaf_3_Niz_C: Double?,
//        Okhl_diaf_3_Levo_C: Double?,
//        Okhl_diaf_4_Verkh_C: Double?,
//        Okhl_diaf_4_Pravo_C: Double?,
//        Okhl_diaf_4_Niz_C: Double?,
//        Okhl_diaf_4_Levo_C: Double?,
//        Okhl_diaf_5_Verkh_C: Double?,
//        Okhl_diaf_5_Pravo_C: Double?,
//        Okhl_diaf_5_Niz_C: Double?,
//        Okhl_diaf_5_Levo_C: Double?,
//        Li_mishen_Tok_mA: Double?,
//        Li_mishen_Tsentr_0_C: Double?,
//        Li_mishen_Niz_pravo_1_C: Double?,
//        Li_mishen_Pravo_2_C: Double?,
//        Li_mishen_Verkh_pravo_3_C: Double?,
//        Li_mishen_Verkh_4_C: Double?,
//        Li_mishen_Verkh_levo_5_C: Double?,
//        Li_mishen_Levo_6_C: Double?,
//        Li_mishen_Niz_levo_7_C: Double?,
//        Li_mishen_Voda_vkhod_l_min: Double?,
//        Li_mishen_Voda_vykhod_1_l_min: Double?,
//        Li_mishen_Voda_vykhod_2_l_min: Double?,
//        Li_mishen_Vakuum_Pa: Double?,
//        Li_mishen_9_Tsentr_0_C: Double?,
//        Li_mishen_9_M_Pravo_1_C: Double?,
//        Li_mishen_9_B_Pravo_2_C: Double?,
//        Li_mishen_9_M_Verkh_3_C: Double?,
//        Li_mishen_9_B_Verkh_4_C: Double?,
//        Li_mishen_9_M_Levo_5_C: Double?,
//        Li_mishen_9_B_Levo_6_C: Double?,
//        Li_mishen_9_M_Niz_7_C: Double?,
//        Li_mishen_9_B_Niz_8_C: Double?,
//        Bop_1M_B2_Zal_Gamma_Zv_Ch: Double?,
//        Bop_1M_B2_Zal_Neitrony_Zv_Ch: Double?,
//        Bop_1M_B2_Kor_Gamma_Zv_Ch: Double?,
//        Bop_1M_B2_Kor_Neitrony_Zv_Ch: Double?,
//        Bop_1M_B3_Zal_Gamma_Zv_Ch: Double?,
//        Bop_1M_B3_Zal_Neitrony_Zv_Ch: Double?,
//        Bop_1M_B3_Kor_Gamma_Zv_Ch: Double?,
//        Bop_1M_B3_Kor_Neitrony_Zv_Ch: Double?,
//        Li6_Neitrony_sht_sek: Double?,
//        Li6_Gamma_sht_sek: Double?,
//        Li6_Zagruzka_persent: Double?,
//        Li6_Integral_neitronov_sht: Double?,
//        Eff_obdirki_Neitraly_I_mA: Double?,
//        Eff_obdirki_Eff_persent: Double?,
//        UltravoltPs_300V_U_set_V: Double?,
//        UltravoltPs_300V_I_set_mA: Double?,
//        UltravoltPs_300V_U_get_V: Double?,
//        UltravoltPs_300V_I_get_mA: Double?,
//        BDN_A_n_sht_sek: Double?,
//        BDN_A_g_sht_sek: Double?,
//        BDN_A_gn_sht_sek: Double?,
//        BDN_A_gSv_Zv_Ch: Double?,
//        BDN_A_nSv_Zv_Ch: Double?,
//        BDN_B_n_sht_sek: Double?,
//        BDN_B_g_sht_sek: Double?,
//        BDN_B_gn_sht_sek: Double?,
//        BDN_B_gSv_Zv_Ch: Double?,
//        BDN_B_nSv_Zv_Ch: Double?,
//        BDN_C_n_sht_sek: Double?,
//        BDN_C_g_sht_sek: Double?,
//        BDN_C_gn_sht_sek: Double?,
//        BDN_C_gSv_Zv_Ch: Double?,
//        BDN_C_nSv_Zv_Ch: Double?,
//        Obdir_mish_Sliv_C: Double?,
//        Obdir_mish_Napor_C: Double?,
//        Obdir_mish_Moshchnost_Vt: Double?,
//        Obdir_mish_Potok_l_min: Double?,
//        Obdir_mish_Argon: Double?,
//        HPGe_Mertvoe_vremia_persent: Double?,
//        HPGe_Skorost_v_integrale_sht_sek: Double?,
//        HPGe_Integral_sht: Double?,
//        Vychisliator_fliuensa_Bergoz_HEBL_Tok_Fliuens_mAch: Double?,
//        Vychisliator_fliuensa_ELV_Beam0_Fliuens_mAch: Double?,
//        Vychisliator_fliuensa_Bop_1M_B2_Zal_Gamma_Fliuens_mAch: Double?,
//        Vychisliator_fliuensa_Bop_1M_B2_Zal_Neitrony_Fliuens_mAch: Double?,
//        Vychisliator_fliuensa_Li6_Neitrony_Fliuens_mAch: Double?,
//        Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Sliv_C: Double?,
//        Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Napor_C: Double?,
//        Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Moshchnost_Vt: Double?,
//        Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Potok_l_min: Double?,
//        Vakuum_Uskoritel_vykhod_Pa: Double?,
//        Vakuum_HEBL_Posle_razvertki_Pa: Double?,
//        operatorPcDT: String?,
//        journal: String?
    ) {
        this.Polnaia_data = Polnaia_data
        this.H_Konus_mA = H_Konus_mA
        this.H_Linza_Voblova_Sliv_C = H_Linza_Voblova_Sliv_C
//        this.H_Linza_Voblova_Napor_C = H_Linza_Voblova_Napor_C
//        this.H_Linza_Voblova_Moshchnost_Vt = H_Linza_Voblova_Moshchnost_Vt
//        this.H_Linza_Voblova_Potok_l_min = H_Linza_Voblova_Potok_l_min
//        this.H_Napor_IFM_l_min = H_Napor_IFM_l_min
//        this.H_Sliv_IFM_l_min = H_Sliv_IFM_l_min
//        this.H_Istochnik_Pa = H_Istochnik_Pa
//        this.H_Diff_otkachka_Pa = H_Diff_otkachka_Pa
//        this.Bergoz_HEBL_Tok_mA = Bergoz_HEBL_Tok_mA
//        this.Konus_1_Tok_mA = Konus_1_Tok_mA
//        this.Konus_1_Tsentr_C = Konus_1_Tsentr_C
//        this.Konus_1_M_Verkh_C = Konus_1_M_Verkh_C
//        this.Konus_1_M_Pravo_C = Konus_1_M_Pravo_C
//        this.Konus_1_M_Niz_C = Konus_1_M_Niz_C
//        this.Konus_1_M_Levo_C = Konus_1_M_Levo_C
//        this.Konus_1_B_Verkh_C = Konus_1_B_Verkh_C
//        this.Konus_1_B_Pravo_C = Konus_1_B_Pravo_C
//        this.Konus_1_B_Niz_C = Konus_1_B_Niz_C
//        this.Konus_1_B_Levo_C = Konus_1_B_Levo_C
//        this.Konus_2_Tok_mA = Konus_2_Tok_mA
//        this.Konus_2_Tsentr_C = Konus_2_Tsentr_C
//        this.Konus_2_M_Verkh_C = Konus_2_M_Verkh_C
//        this.Konus_2_M_Pravo_C = Konus_2_M_Pravo_C
//        this.Konus_2_M_Niz_C = Konus_2_M_Niz_C
//        this.Konus_2_M_Levo_C = Konus_2_M_Levo_C
//        this.Konus_2_B_Verkh_C = Konus_2_B_Verkh_C
//        this.Konus_2_B_Pravo_C = Konus_2_B_Pravo_C
//        this.Konus_2_B_Niz_C = Konus_2_B_Niz_C
//        this.Konus_2_B_Levo_C = Konus_2_B_Levo_C
//        this.ELV_Energiia_keV = ELV_Energiia_keV
//        this.ELV_Beam0_mA = ELV_Beam0_mA
//        this.ELV_EnergyU_get_kV = ELV_EnergyU_get_kV
//        this.ELV_EnergyU_set_kV = ELV_EnergyU_set_kV
//        this.ELV_EnergyI_mA = ELV_EnergyI_mA
//        this.ELV_Avarage_mA = ELV_Avarage_mA
//        this.ELV_Sec1U_kV = ELV_Sec1U_kV
//        this.ELV_Sec1I_mA = ELV_Sec1I_mA
//        this.ELV_IsolatorU_kV = ELV_IsolatorU_kV
//        this.ELV_IsolatorI_mA = ELV_IsolatorI_mA
//        this.ELV_Dark_mA = ELV_Dark_mA
//        this.Okhl_diaf_1_Verkh_C = Okhl_diaf_1_Verkh_C
//        this.Okhl_diaf_1_Pravo_C = Okhl_diaf_1_Pravo_C
//        this.Okhl_diaf_1_Niz_C = Okhl_diaf_1_Niz_C
//        this.Okhl_diaf_1_Levo_C = Okhl_diaf_1_Levo_C
//        this.Okhl_diaf_2_Verkh_C = Okhl_diaf_2_Verkh_C
//        this.Okhl_diaf_2_Pravo_C = Okhl_diaf_2_Pravo_C
//        this.Okhl_diaf_2_Niz_C = Okhl_diaf_2_Niz_C
//        this.Okhl_diaf_2_Levo_C = Okhl_diaf_2_Levo_C
//        this.Okhl_diaf_3_Verkh_C = Okhl_diaf_3_Verkh_C
//        this.Okhl_diaf_3_Pravo_C = Okhl_diaf_3_Pravo_C
//        this.Okhl_diaf_3_Niz_C = Okhl_diaf_3_Niz_C
//        this.Okhl_diaf_3_Levo_C = Okhl_diaf_3_Levo_C
//        this.Okhl_diaf_4_Verkh_C = Okhl_diaf_4_Verkh_C
//        this.Okhl_diaf_4_Pravo_C = Okhl_diaf_4_Pravo_C
//        this.Okhl_diaf_4_Niz_C = Okhl_diaf_4_Niz_C
//        this.Okhl_diaf_4_Levo_C = Okhl_diaf_4_Levo_C
//        this.Okhl_diaf_5_Verkh_C = Okhl_diaf_5_Verkh_C
//        this.Okhl_diaf_5_Pravo_C = Okhl_diaf_5_Pravo_C
//        this.Okhl_diaf_5_Niz_C = Okhl_diaf_5_Niz_C
//        this.Okhl_diaf_5_Levo_C = Okhl_diaf_5_Levo_C
//        this.Li_mishen_Tok_mA = Li_mishen_Tok_mA
//        this.Li_mishen_Tsentr_0_C = Li_mishen_Tsentr_0_C
//        this.Li_mishen_Niz_pravo_1_C = Li_mishen_Niz_pravo_1_C
//        this.Li_mishen_Pravo_2_C = Li_mishen_Pravo_2_C
//        this.Li_mishen_Verkh_pravo_3_C = Li_mishen_Verkh_pravo_3_C
//        this.Li_mishen_Verkh_4_C = Li_mishen_Verkh_4_C
//        this.Li_mishen_Verkh_levo_5_C = Li_mishen_Verkh_levo_5_C
//        this.Li_mishen_Levo_6_C = Li_mishen_Levo_6_C
//        this.Li_mishen_Niz_levo_7_C = Li_mishen_Niz_levo_7_C
//        this.Li_mishen_Voda_vkhod_l_min = Li_mishen_Voda_vkhod_l_min
//        this.Li_mishen_Voda_vykhod_1_l_min = Li_mishen_Voda_vykhod_1_l_min
//        this.Li_mishen_Voda_vykhod_2_l_min = Li_mishen_Voda_vykhod_2_l_min
//        this.Li_mishen_Vakuum_Pa = Li_mishen_Vakuum_Pa
//        this.Li_mishen_9_Tsentr_0_C = Li_mishen_9_Tsentr_0_C
//        this.Li_mishen_9_M_Pravo_1_C = Li_mishen_9_M_Pravo_1_C
//        this.Li_mishen_9_B_Pravo_2_C = Li_mishen_9_B_Pravo_2_C
//        this.Li_mishen_9_M_Verkh_3_C = Li_mishen_9_M_Verkh_3_C
//        this.Li_mishen_9_B_Verkh_4_C = Li_mishen_9_B_Verkh_4_C
//        this.Li_mishen_9_M_Levo_5_C = Li_mishen_9_M_Levo_5_C
//        this.Li_mishen_9_B_Levo_6_C = Li_mishen_9_B_Levo_6_C
//        this.Li_mishen_9_M_Niz_7_C = Li_mishen_9_M_Niz_7_C
//        this.Li_mishen_9_B_Niz_8_C = Li_mishen_9_B_Niz_8_C
//        this.Bop_1M_B2_Zal_Gamma_Zv_Ch = Bop_1M_B2_Zal_Gamma_Zv_Ch
//        this.Bop_1M_B2_Zal_Neitrony_Zv_Ch = Bop_1M_B2_Zal_Neitrony_Zv_Ch
//        this.Bop_1M_B2_Kor_Gamma_Zv_Ch = Bop_1M_B2_Kor_Gamma_Zv_Ch
//        this.Bop_1M_B2_Kor_Neitrony_Zv_Ch = Bop_1M_B2_Kor_Neitrony_Zv_Ch
//        this.Bop_1M_B3_Zal_Gamma_Zv_Ch = Bop_1M_B3_Zal_Gamma_Zv_Ch
//        this.Bop_1M_B3_Zal_Neitrony_Zv_Ch = Bop_1M_B3_Zal_Neitrony_Zv_Ch
//        this.Bop_1M_B3_Kor_Gamma_Zv_Ch = Bop_1M_B3_Kor_Gamma_Zv_Ch
//        this.Bop_1M_B3_Kor_Neitrony_Zv_Ch = Bop_1M_B3_Kor_Neitrony_Zv_Ch
//        this.Li6_Neitrony_sht_sek = Li6_Neitrony_sht_sek
//        this.Li6_Gamma_sht_sek = Li6_Gamma_sht_sek
//        this.Li6_Zagruzka_persent = Li6_Zagruzka_persent
//        this.Li6_Integral_neitronov_sht = Li6_Integral_neitronov_sht
//        this.Eff_obdirki_Neitraly_I_mA = Eff_obdirki_Neitraly_I_mA
//        this.Eff_obdirki_Eff_persent = Eff_obdirki_Eff_persent
//        this.UltravoltPs_300V_U_set_V = UltravoltPs_300V_U_set_V
//        this.UltravoltPs_300V_I_set_mA = UltravoltPs_300V_I_set_mA
//        this.UltravoltPs_300V_U_get_V = UltravoltPs_300V_U_get_V
//        this.UltravoltPs_300V_I_get_mA = UltravoltPs_300V_I_get_mA
//        this.BDN_A_n_sht_sek = BDN_A_n_sht_sek
//        this.BDN_A_g_sht_sek = BDN_A_g_sht_sek
//        this.BDN_A_gn_sht_sek = BDN_A_gn_sht_sek
//        this.BDN_A_gSv_Zv_Ch = BDN_A_gSv_Zv_Ch
//        this.BDN_A_nSv_Zv_Ch = BDN_A_nSv_Zv_Ch
//        this.BDN_B_n_sht_sek = BDN_B_n_sht_sek
//        this.BDN_B_g_sht_sek = BDN_B_g_sht_sek
//        this.BDN_B_gn_sht_sek = BDN_B_gn_sht_sek
//        this.BDN_B_gSv_Zv_Ch = BDN_B_gSv_Zv_Ch
//        this.BDN_B_nSv_Zv_Ch = BDN_B_nSv_Zv_Ch
//        this.BDN_C_n_sht_sek = BDN_C_n_sht_sek
//        this.BDN_C_g_sht_sek = BDN_C_g_sht_sek
//        this.BDN_C_gn_sht_sek = BDN_C_gn_sht_sek
//        this.BDN_C_gSv_Zv_Ch = BDN_C_gSv_Zv_Ch
//        this.BDN_C_nSv_Zv_Ch = BDN_C_nSv_Zv_Ch
//        this.Obdir_mish_Sliv_C = Obdir_mish_Sliv_C
//        this.Obdir_mish_Napor_C = Obdir_mish_Napor_C
//        this.Obdir_mish_Moshchnost_Vt = Obdir_mish_Moshchnost_Vt
//        this.Obdir_mish_Potok_l_min = Obdir_mish_Potok_l_min
//        this.Obdir_mish_Argon = Obdir_mish_Argon
//        this.HPGe_Mertvoe_vremia_persent = HPGe_Mertvoe_vremia_persent
//        this.HPGe_Skorost_v_integrale_sht_sek = HPGe_Skorost_v_integrale_sht_sek
//        this.HPGe_Integral_sht = HPGe_Integral_sht
//        this.Vychisliator_fliuensa_Bergoz_HEBL_Tok_Fliuens_mAch = Vychisliator_fliuensa_Bergoz_HEBL_Tok_Fliuens_mAch
//        this.Vychisliator_fliuensa_ELV_Beam0_Fliuens_mAch = Vychisliator_fliuensa_ELV_Beam0_Fliuens_mAch
//        this.Vychisliator_fliuensa_Bop_1M_B2_Zal_Gamma_Fliuens_mAch =
//            Vychisliator_fliuensa_Bop_1M_B2_Zal_Gamma_Fliuens_mAch
//        this.Vychisliator_fliuensa_Bop_1M_B2_Zal_Neitrony_Fliuens_mAch =
//            Vychisliator_fliuensa_Bop_1M_B2_Zal_Neitrony_Fliuens_mAch
//        this.Vychisliator_fliuensa_Li6_Neitrony_Fliuens_mAch = Vychisliator_fliuensa_Li6_Neitrony_Fliuens_mAch
//        this.Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Sliv_C = Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Sliv_C
//        this.Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Napor_C = Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Napor_C
//        this.Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Moshchnost_Vt =
//            Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Moshchnost_Vt
//        this.Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Potok_l_min =
//            Uskoritel_Vkhodnaia_okhlazhdaemaia_diafragma_Potok_l_min
//        this.Vakuum_Uskoritel_vykhod_Pa = Vakuum_Uskoritel_vykhod_Pa
//        this.Vakuum_HEBL_Posle_razvertki_Pa = Vakuum_HEBL_Posle_razvertki_Pa
//        this.operatorPcDT = operatorPcDT
//        this.journal = journal
    }
}