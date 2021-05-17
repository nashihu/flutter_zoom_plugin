class ZoomOptions {
  String domain;
  String jwtToken;

  ZoomOptions({this.domain, this.jwtToken});
}

class ZoomMeetingOptions {
  String userId;
  String displayName;
  String meetingId;
  String meetingPassword;
  String zoomToken;
  String zoomAccessToken;
  String disableDialIn;
  String disableDrive;
  String disableInvite;
  String disableShare;
  String noDisconnectAudio;
  String noAudio;

  ZoomMeetingOptions(
      {this.userId,
      this.displayName,
      this.meetingId,
      this.meetingPassword,
      this.zoomToken,
      this.zoomAccessToken,
      this.disableDialIn,
      this.disableDrive,
      this.disableInvite,
      this.disableShare,
      this.noDisconnectAudio,
      this.noAudio});
}
