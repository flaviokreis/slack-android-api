package slack.android.api.webapi.params;

/**
 * Set optional arguments to Slack Web Api Chat Updated method
 */
public class ChatUpdateParams extends Params {

    /**
     * Structured message attachments.
     *
     * @param attachments
     */
    public void setAttachments(String attachments){
        put(SlackParamsConstants.ATTACHMENTS, attachments);
    }

    /**
     * Change how messages are treated.
     *
     * Default: none
     *
     * @param parse
     */
    public void setParse(String parse){
        put(SlackParamsConstants.PARSE, parse);
    }

    /**
     * Find and link channel names and usernames.
     *
     * @param linkNames
     */
    public void setLinkNames(boolean linkNames){
        put(SlackParamsConstants.LINK_NAMES, linkNames);
    }

    /**
     * Pass true to post the message as the authed user, instead of as a
     * bot. Defaults to false.
     *
     * @param asUser
     */
    public void setAsUser(boolean asUser){
        put(SlackParamsConstants.AS_USER, asUser);
    }
}
