try {
			HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext()
					.getSession(false);
			ExternalContext extCon = FacesContext.getCurrentInstance().getExternalContext();
			HttpServletRequest htReq = (HttpServletRequest) extCon.getRequest();
			htReq.logout();
			extCon.redirect("/contextroot/login.xhtml?faces-redirect=true");
			updateConnecxionHistorique();
		} catch (Exception ea) {
			ea.printStackTrace();
		}
		return "login";
