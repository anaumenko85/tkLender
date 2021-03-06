package com.tklender.staticdata;

public enum PageUrl  {
	BASE_URL("http://vm-elender:9288"),
	LOGIN_PAGE(BASE_URL+"/Account/Login"), //
	BACK_FIRSTPAGE(BASE_URL+"/App#/origination"), 
	SYSTEM_HOME("http://vm-elender:9288/App#/system/administration"),
	ADMIN_ADD_MEMBER("http://cells.org.ua/scrum-selenium/admin/pageEditMember.php"), //
	ADMIN_EDIT_MEMBER("http://cells.org.ua/scrum-selenium/admin/pageEditMember.php?memberID=%s"), // 
	ADMIN_VIEW_MEMBER_PAGE("http://cells.org.ua/scrum-selenium/admin/pageViewMembers.php"), //
	;

	private String urlValue;

	private PageUrl(String urlValue) {
		this.urlValue = urlValue;
	}

	public String getUrl() {
		return urlValue;
	}



}
