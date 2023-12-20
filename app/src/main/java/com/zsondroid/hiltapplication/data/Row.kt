package com.zsondroid.hiltapplication.data


import com.google.gson.annotations.SerializedName

data class Row(
    @SerializedName("ADD_UNIT_TM")
    val addUnitTm: String,
    @SerializedName("ADD_UNIT_TM2_WITHIN_USE_CHRG")
    val addUnitTm2WithinUseChrg: String,
    @SerializedName("CHRG_INFO")
    val chrgInfo: String,
    @SerializedName("CONTCT_NO")
    val contctNo: String,
    @SerializedName("DATA_REGIST_INST_CD")
    val dataRegistInstCd: String,
    @SerializedName("DATA_REGIST_INST_NM")
    val dataRegistInstNm: String,
    @SerializedName("DATA_STD_DE")
    val dataStdDe: String,
    @SerializedName("DAY1_PARKTK_CHRG_APPLCTN_TM")
    val day1ParkTkChrgApplctnTm: String,
    @SerializedName("DAY1_PARKTK_USE_CHRG")
    val day1ParkTkUseChrg: String,
    @SerializedName("HOLIDAY_OPERT_BEGIN_TM")
    val holidayOpertBeginTm: String,
    @SerializedName("HOLIDAY_OPERT_END_TM")
    val holidayOpertEndTm: String,
    @SerializedName("LANDGRAD_DIV_NM")
    val landgradDivNm: String,
    @SerializedName("MANAGE_INST_NM")
    val manageInstNm: String,
    @SerializedName("MT_CMMTICKT_WEEK_USE_CHRG")
    val mtCmmTicktWeekUseChrg: String,
    @SerializedName("NO")
    val no: Int,
    @SerializedName("PARKNG_BASIS_TM")
    val parkingBasisTm: String,
    @SerializedName("PARKNG_BASIS_USE_CHRG")
    val parkingBasisUseChrg: String,
    @SerializedName("PARKNG_COMPRT_PLANE_CNT")
    val parkingComprtPlaneCnt: Int,
    @SerializedName("PARKPLC_DIV_NM")
    val parkingDivNm: String,
    @SerializedName("PARKPLC_MANAGE_NO")
    val parkPlcManageNo: String,
    @SerializedName("PARKPLC_TYPE")
    val parkPlcType: String,
    @SerializedName("REFINE_LOTNO_ADDR")
    val refineLotNoAddr: String,
    @SerializedName("REFINE_ROADNM_ADDR")
    val refineRoadNmAddr: String,
    @SerializedName("REFINE_WGS84_LAT")
    val refineWgs84Lat: String,
    @SerializedName("REFINE_WGS84_LOGT")
    val RefineWgs84Logt: String,
    @SerializedName("REFINE_ZIP_CD")
    val refineZipCd: String,
    @SerializedName("SAT_OPERT_BEGIN_TM")
    val satOpertBeginTm: String,
    @SerializedName("SAT_OPERT_END_TM")
    val satOpertEndTm: String,
    @SerializedName("SETTLE_METH")
    val settleMeth: String,
    @SerializedName("SIGUN_CD")
    val sigunCd: String,
    @SerializedName("SIGUN_NM")
    val sigunNm: String,
    @SerializedName("SPCLABLT_MATR")
    val spclabltMatr: Any,
    @SerializedName("SUBTL_IMPLMTN_DIV_NM")
    val subTlImplmTnDivNm: String,
    @SerializedName("TMP01")
    val tmp01: String,
    @SerializedName("TMP02")
    val tmp02: String,
    @SerializedName("WKDAY_OPERT_BEGIN_TM")
    val wkDayOpertBeginTm: String,
    @SerializedName("WKDAY_OPERT_END_TM")
    val wkDayOpertEndTm: String
)