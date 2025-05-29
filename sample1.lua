local macro = CreateFrame("Frame")
macro:RegisterEvent("ACTIVE_TALENT_GROUP_CHANGED")
macro:SetScript("OnEvent", function(frame, event, firstArg, secondArg)
	if event == "ACTIVE_TALENT_GROUP_CHANGED" then
		--ACTIVE_TALENT_GROUP_CHANGED(frame, event, firstArg, secondArg);
		DEFAULT_CHAT_FRAME:AddMessage("SPECS CHANGED")
		MBSP_ACTIVE_TALENT_GROUP_CHANGED()
	end
end)
