package com.touku.webapp.config;

public class URL_data {

public enum URL_enum {
		
		URL_WelcomeHome("https://touku.net/#/welcome"),
		URL_Login("https://touku.net/#/login"),
		URL_Signup("https://touku.net/#/register/"),
		URL_FacebookLogin("https://www.facebook.com/login.php?skip_api_login=1&api_key=534252273873820&kid_directed_site=0&app_id=534252273873820&signed_next=1&next=https%3A%2F%2Fwww.facebook.com%2Fv8.0%2Fdialog%2Foauth%3Fresponse_type%3Dcode%252Cgranted_scopes%26client_id%3D534252273873820%26redirect_uri%3Dhttps%253A%252F%252Fangelium-71cf5.firebaseapp.com%252F__%252Fauth%252Fhandler%26state%3DAMbdmDnNDsX1nPgBQFdHRUkKf-kPnfUZ3Cvvb6xvtHsMTZBbIB_0LY4JvEtPfy9YjtF8qcHpZK5ntShLHXz4k6Ogkjp4xsisteLX2jHdLgX6M-oO_ef4BjU6P3dDraRw61vNklqAaA6yxsL9B_st3ydBHY7dxL5ZKmG3zEiSCJHP_j21uc7s9BS3_koAAted043pfS4bCQF6v7EqUoRrw4McWeRAxJFfbRoPLFXIy4YJKj9nrSQ04VeDHmTl4EWqVGUVBgF1OmIema7gPbMNQ-6qXSBEhoxH8s37aS_7qCbzuQtwaz5KjPVHCtAAXu_3WRtPNQOoZNITEIE5-xI3MRc%26scope%3Dpublic_profile%26context_uri%3Dhttps%253A%252F%252Fwww.touku.net%26ret%3Dlogin%26fbapp_pres%3D0%26logger_id%3D08be54fe-6890-44eb-96e8-dafad38e91b1&cancel_url=https%3A%2F%2Fangelium-71cf5.firebaseapp.com%2F__%2Fauth%2Fhandler%3Ferror%3Daccess_denied%26error_code%3D200%26error_description%3DPermissions%2Berror%26error_reason%3Duser_denied%26state%3DAMbdmDnNDsX1nPgBQFdHRUkKf-kPnfUZ3Cvvb6xvtHsMTZBbIB_0LY4JvEtPfy9YjtF8qcHpZK5ntShLHXz4k6Ogkjp4xsisteLX2jHdLgX6M-oO_ef4BjU6P3dDraRw61vNklqAaA6yxsL9B_st3ydBHY7dxL5ZKmG3zEiSCJHP_j21uc7s9BS3_koAAted043pfS4bCQF6v7EqUoRrw4McWeRAxJFfbRoPLFXIy4YJKj9nrSQ04VeDHmTl4EWqVGUVBgF1OmIema7gPbMNQ-6qXSBEhoxH8s37aS_7qCbzuQtwaz5KjPVHCtAAXu_3WRtPNQOoZNITEIE5-xI3MRc%23_%3D_&display=page&locale=en_GB&pl_dbl=0"),
		URL_TwitterLogin(""),
		URL_LineLogin("https://access.line.me/oauth2/v2.1/login?loginState=VYEueLxRAMHBVCUGg5bN05&loginChannelId=1653925489&returnUri=%2Foauth2%2Fv2.1%2Fauthorize%2Fconsent%3Fscope%3Dprofile%2Bopenid%2Bemail%26response_type%3Dcode%26state%3D1653865281%26redirect_uri%3Dhttps%253A%252F%252Fwww.touku.net%26nonce%3D09876xyz%26client_id%3D1653925489#/"),
		URL_GoogleLogin("https://accounts.google.com/o/oauth2/auth/oauthchooseaccount?response_type=code&client_id=185609886814-rderde876lo4143bas6l1oj22qoskrdl.apps.googleusercontent.com&redirect_uri=https%3A%2F%2Fangelium-71cf5.firebaseapp.com%2F__%2Fauth%2Fhandler&state=AMbdmDlQxkxysKpm13w_0GiHDyz-j4O0ajuYJkojwKbvAQQQbZcS0yvBX39ZYh0iq1IYydJgmL6K7U0bAQhPCXXyMLvNSCVKEIxDC-KzdGWx_G3CcmQZPtXVwYmbw33Fxzsj_GJO0sd3SEm-eqU_I5djQBRLNPORKkBiLTLxI6iPxxYGLZbSmP9gREfoKIsxtBO_1A90_PeiK3kioLbQHfLdSZptubLUo3jTtOl0UrWcg3eTuV2EBcRv_6zwyjOenUGbELWXDPKBI9LuYL7JCOfVUmAtTbBsw6D-HefApjmZ-kuoAS3ESoOhhdK2qBnFFrtxCZiTtZyD&scope=openid%20profile%20email&context_uri=https%3A%2F%2Fwww.touku.net&flowName=GeneralOAuthFlow"),
		URL_TalkLogin("https://accounts.kakao.com/login?continue=https%3A%2F%2Fkauth.kakao.com%2Foauth%2Fauthorize%3Fis_popup%3Dfalse%26ka%3Dsdk%252F1.39.7%2520os%252Fjavascript%2520sdk_type%252Fjavascript%2520lang%252Fen-US%2520device%252FLinux_x86_64%2520origin%252Fhttps%25253A%25252F%25252Fwww.touku.net%26scope%3Daccount_email%26auth_tran_id%3Dng1ss6fwjor7608d108073fe9a65906c012b5c3f489kf28359m%26response_type%3Dcode%26redirect_uri%3Dhttps%253A%252F%252Fwww.touku.net%26client_id%3D7608d108073fe9a65906c012b5c3f489"),
		URL_APPLE_Login("https://appleid.apple.com/auth/authorize?response_type=code&client_id=com.angelium.touku&redirect_uri=https%3A%2F%2Fangelium-71cf5.firebaseapp.com%2F__%2Fauth%2Fhandler&state=AMbdmDmxbB2DFH1Mc2WaPel73etJoZZa1YrOho5nlSy3nRmsdERsWc8kdo-z8FkdgmZOPKr9oWn7fbWTC8HFfuPo9YHFgQiY2L_0ZP1TFMUTS7debg7cYzHJy8ixI1KYQOWNsrT7MS0QB12Sk5UZ0qKm2B0oJhVpdPUSlecXevkTJp8PefCMOn3RzNLssqvK1iZqUCL87xWrz0vu6WjOd40gyNPFEmks7wJxwSeMjkgHRNBMuWj2CSe50dkgqwEJwZ-KdqlhUd6-xjWSAT6rV1doza4HlgaOhhWyBT5TVECnKolX1wAR0dWvJxAvoP36W-H4ljQdvg&scope=email%20name&response_mode=form_post&context_uri=https%3A%2F%2Fwww.touku.net"),
		URL_ADMINHome("https://www.touku.net/#/admin-dashboard/556"),
		URL_ADMINClickHereButton("https://site.touku.net/how-to-change-password-touku/?lang=en"),
		URL_ADMINAnnouncementDetails("https://www.touku.net/#/anouncement-detail/556"),
		URL_ADMINComposeMessage("https://www.touku.net/#/message-compose/556"),
		URL_ADMINStartAChatFollowers("https://www.touku.net/#/sub-chat-home/556"),
		URL_ADMINMessageListPage("https://www.touku.net/#/message-compose/556/message-compose-list"),
		URL_ADMINScenarioListPage("https://www.touku.net/#/scenario/556/scenario-list");

	public String URL;
		
		private URL_enum(String URL) {
			this.URL = URL;
		}
	}
}
