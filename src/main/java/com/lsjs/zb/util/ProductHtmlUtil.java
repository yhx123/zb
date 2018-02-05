package com.lsjs.zb.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杨红星
 * @version 1.0.0
 */
public class ProductHtmlUtil {
    public static String getHtnl(String code) {
        String text1="<html>\n" +
                "<head><meta http-equiv=\"CreateMessage-Type\" content=\"text/html; charset=UTF-8\"></head>\n" +
                "<div id=\"contentDiv\" onmouseover=\"getTop().stopPropagation(event);\" onclick=\"getTop().preSwapLink(event, 'html', 'ZC1314-G~22dF5NVwPzLTJqTFMLZ74');\" style=\"position:relative;font-size:14px;height:auto;padding:15px 15px 10px 15px;z-index:1;zoom:1;line-height:1.7;\" class=\"body\">    <div id=\"qm_con_body\"><div id=\"mailContentContainer\" class=\"qmbox qm_con_body_content qqmail_webmail_only\" style=\"\">\n" +
                "\n" +
                "\n" +
                "<style type=\"text/css\">/* Resets */\n" +
                "\n" +
                "  .qmbox .ReadMsgBody { width: 100%; background-color: #ebebeb;}\n" +
                "\n" +
                "  .qmbox .ExternalClass {width: 100%; background-color: #ebebeb;}\n" +
                "\n" +
                "  .qmbox .ExternalClass, .qmbox .ExternalClass p, .qmbox .ExternalClass span, .qmbox .ExternalClass font, .qmbox .ExternalClass td, .qmbox .ExternalClass div {line-height:100%;}\n" +
                "\n" +
                "  .qmbox body {-webkit-text-size-adjust:none; -ms-text-size-adjust:none;}\n" +
                "\n" +
                "  .qmbox body {margin:0; padding:0;}\n" +
                "\n" +
                "  .qmbox table {border-spacing:0;}\n" +
                "\n" +
                "  .qmbox table td {border-collapse:collapse;}\n" +
                "\n" +
                "  .qmbox .yshortcuts a {border-bottom: none !important;}\n" +
                "\n" +
                "\n" +
                "\n" +
                "  /* Constrain email width for small screens */\n" +
                "\n" +
                "  @media screen and (max-width: 600px) {\n" +
                "\n" +
                "      .qmbox table[class=\"container\"] {\n" +
                "\n" +
                "          width: 95% !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "  /* Give content more room on mobile */\n" +
                "\n" +
                "  @media screen and (max-width: 480px) {\n" +
                "\n" +
                "      .qmbox td[class=\"container-padding\"] {\n" +
                "\n" +
                "          padding-left: 12px !important;\n" +
                "\n" +
                "          padding-right: 12px !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "  }\n" +
                "\n" +
                "\n" +
                "\n" +
                "  /* Styles for forcing columns to rows */\n" +
                "\n" +
                "  @media only screen and (max-width : 600px) {\n" +
                "\n" +
                "      /* force container columns to (horizontal) blocks */\n" +
                "\n" +
                "      .qmbox td[class=\"force-col\"] {\n" +
                "\n" +
                "          display: block;\n" +
                "\n" +
                "          padding-right: 0 !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      .qmbox table[class=\"col-2\"] {\n" +
                "\n" +
                "          /* unset table align=\"left/right\" */\n" +
                "\n" +
                "          float: none !important;\n" +
                "\n" +
                "          width: 100% !important;\n" +
                "\n" +
                "\n" +
                "\n" +
                "          /* change left/right padding and margins to top/bottom ones */\n" +
                "\n" +
                "          margin-bottom: 12px;\n" +
                "\n" +
                "          padding-bottom: 12px;\n" +
                "\n" +
                "          border-bottom: 1px solid #eee;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* remove bottom border for last column/row */\n" +
                "\n" +
                "      .qmbox table[id=\"last-col-2\"] {\n" +
                "\n" +
                "          border-bottom: none !important;\n" +
                "\n" +
                "          margin-bottom: 0;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* align images right and shrink them a bit */\n" +
                "\n" +
                "      .qmbox img[class=\"col-2-img\"] {\n" +
                "\n" +
                "          float: right;\n" +
                "\n" +
                "          margin-left: 6px;\n" +
                "\n" +
                "          max-width: 130px;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "  }\n" +
                "\n" +
                "  </style>\n" +
                "<style type=\"text/css\">/* ensure that clients don't add any padding or spaces around the email design and allow us to style emails for the entire width of the preview pane */\n" +
                "\n" +
                "    .qmbox body,.qmbox \n" +
                "\n" +
                "    #bodyTable {\n" +
                "\n" +
                "      height:100% !important;\n" +
                "\n" +
                "      width:100% !important;\n" +
                "\n" +
                "      margin:0;\n" +
                "\n" +
                "      padding:0;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Ensures Webkit- and Windows-based clients don't automatically resize the email text. */\n" +
                "\n" +
                "    .qmbox body,.qmbox \n" +
                "\n" +
                "    table,.qmbox \n" +
                "\n" +
                "    td,.qmbox \n" +
                "\n" +
                "    p,.qmbox \n" +
                "\n" +
                "    a,.qmbox \n" +
                "\n" +
                "    li,.qmbox \n" +
                "\n" +
                "    blockquote {\n" +
                "\n" +
                "      -ms-text-size-adjust:100%;\n" +
                "\n" +
                "      -webkit-text-size-adjust:100%;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Forces Yahoo! to display emails at full width */\n" +
                "\n" +
                "    .qmbox .thread-item.expanded .thread-body .body, .qmbox .msg-body {\n" +
                "\n" +
                "      width: 100% !important;\n" +
                "\n" +
                "      display: block !important;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Forces Hotmail to display emails at full width */\n" +
                "\n" +
                "    .qmbox .ReadMsgBody,.qmbox \n" +
                "\n" +
                "    .ExternalClass {\n" +
                "\n" +
                "      width: 100%;\n" +
                "\n" +
                "      background-color: #f4f4f4;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Forces Hotmail to display normal line spacing. */\n" +
                "\n" +
                "    .qmbox .ExternalClass,.qmbox \n" +
                "\n" +
                "    .ExternalClass p,.qmbox \n" +
                "\n" +
                "    .ExternalClass span,.qmbox \n" +
                "\n" +
                "    .ExternalClass font,.qmbox \n" +
                "\n" +
                "    .ExternalClass td,.qmbox \n" +
                "\n" +
                "    .ExternalClass div {\n" +
                "\n" +
                "      line-height:100%;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Resolves webkit padding issue. */\n" +
                "\n" +
                "    .qmbox table {\n" +
                "\n" +
                "      border-spacing:0;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Resolves the Outlook 2007, 2010, and Gmail td padding issue, and removes spacing around tables that Outlook adds. */\n" +
                "\n" +
                "    .qmbox table,.qmbox \n" +
                "\n" +
                "    td {\n" +
                "\n" +
                "      border-collapse:collapse;\n" +
                "\n" +
                "      mso-table-lspace:0pt;\n" +
                "\n" +
                "      mso-table-rspace:0pt;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Corrects the way Internet Explorer renders resized images in emails. */\n" +
                "\n" +
                "    .qmbox img {\n" +
                "\n" +
                "      -ms-interpolation-mode: bicubic;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Ensures images don't have borders or text-decorations applied to them by default. */\n" +
                "\n" +
                "    .qmbox img,.qmbox \n" +
                "\n" +
                "    a img {\n" +
                "\n" +
                "      border:0;\n" +
                "\n" +
                "      outline:none;\n" +
                "\n" +
                "      text-decoration:none;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Styles Yahoo's auto-sensing link color and border */\n" +
                "\n" +
                "    .qmbox .yshortcuts a {\n" +
                "\n" +
                "      border-bottom: none !important;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Styles the tel URL scheme */\n" +
                "\n" +
                "    .qmbox a[href^=tel],.qmbox \n" +
                "\n" +
                "    .mobile_link,.qmbox \n" +
                "\n" +
                "    .mobile_link a {\n" +
                "\n" +
                "      color:#222222 !important;\n" +
                "\n" +
                "      text-decoration: underline !Important;\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Media queries for when the viewport is smaller than the default email width but not too narrow. */\n" +
                "\n" +
                "    @media screen and (max-device-width: 600px), screen and (max-width: 600px) {\n" +
                "\n" +
                "      /* Constrains email width for small screens */\n" +
                "\n" +
                "      .qmbox table[class=\"email-container\"],.qmbox \n" +
                "\n" +
                "      .email-container {\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "        border: 0 none !important;\n" +
                "\n" +
                "        border-radius: 0 !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      .qmbox tr[class=\"desktop-padding\"] {\n" +
                "\n" +
                "        height: 0 !important;\n" +
                "\n" +
                "        display: none;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      .qmbox body,.qmbox \n" +
                "\n" +
                "      #bodyTable {\n" +
                "\n" +
                "        background-color: #ffffff !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      /* Constrains tables for small screens */\n" +
                "\n" +
                "      .qmbox table[class=\"fluid\"] {\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Forces images to resize to full width of their container */\n" +
                "\n" +
                "      .qmbox img[class=\"fluid\"],.qmbox \n" +
                "\n" +
                "      img[class=\"force-col-center\"] {\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "        max-width: 100% !important;\n" +
                "\n" +
                "        height: auto !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      /* And centers these ones */\n" +
                "\n" +
                "        .qmbox img[class=\"force-col-center\"] {\n" +
                "\n" +
                "        margin: auto !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Forces table cells into rows */\n" +
                "\n" +
                "      .qmbox td[class=\"force-col\"],.qmbox \n" +
                "\n" +
                "      td[class=\"force-col-center\"] {\n" +
                "\n" +
                "        display: block !important;\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "        clear: both;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      /* And centers these ones */\n" +
                "\n" +
                "      .qmbox td[class=\"force-col-center\"] {\n" +
                "\n" +
                "        text-align: center !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Forces table cells into rows */\n" +
                "\n" +
                "      /* Floats a previously stacked image to the left */\n" +
                "\n" +
                "      .qmbox img[class=\"col-3-img-l\"] {\n" +
                "\n" +
                "        float: left;\n" +
                "\n" +
                "        margin: 0 15px 15px 0;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      /* Floats a previously stacked image to the right */\n" +
                "\n" +
                "      .qmbox img[class=\"col-3-img-r\"] {\n" +
                "\n" +
                "        float: right;\n" +
                "\n" +
                "        margin: 0 0 15px 15px;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Makes buttons full width */\n" +
                "\n" +
                "      .qmbox table[class=\"button\"] {\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "\n" +
                "\n" +
                "    /* Media queries for when the viewport is narrow. */\n" +
                "\n" +
                "    /* Rules prefixed with 'hh-' (for 'handheld') repeat much of what's above, but these don't trigger until the smaller screen width. */\n" +
                "\n" +
                "    @media screen and (max-device-width: 425px), screen and (max-width: 425px) {\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Helper only visible on handhelds. All styles are inline along with a `display:none`, which this class overrides */\n" +
                "\n" +
                "      .qmbox div[class=\"hh-visible\"] {\n" +
                "\n" +
                "        display: block !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Center stuff */\n" +
                "\n" +
                "      .qmbox div[class=\"hh-center\"] {\n" +
                "\n" +
                "        text-align: center;\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Constrain tables for small screens */\n" +
                "\n" +
                "      .qmbox table[class=\"hh-fluid\"] {\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Force images to resize to full width of their container */\n" +
                "\n" +
                "      .qmbox img[class=\"hh-fluid\"],.qmbox \n" +
                "\n" +
                "      img[class=\"hh-force-col-center\"] {\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "        max-width: 100% !important;\n" +
                "\n" +
                "        height: auto !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      /* And center these ones */\n" +
                "\n" +
                "      .qmbox img[class=\"hh-force-col-center\"] {\n" +
                "\n" +
                "        margin: auto !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Force table cells into rows */\n" +
                "\n" +
                "      .qmbox td[class=\"hh-force-col\"],.qmbox \n" +
                "\n" +
                "      td[class=\"hh-force-col-center\"] {\n" +
                "\n" +
                "        display: block !important;\n" +
                "\n" +
                "        width: 100% !important;\n" +
                "\n" +
                "        clear: both;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "      /* And center these ones */\n" +
                "\n" +
                "      .qmbox td[class=\"hh-force-col-center\"] {\n" +
                "\n" +
                "        text-align: center !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "\n" +
                "\n" +
                "      /* Stack the previously floated images */\n" +
                "\n" +
                "      .qmbox img[class=\"col-3-img-l\"],.qmbox \n" +
                "\n" +
                "      img[class=\"col-3-img-r\"] {\n" +
                "\n" +
                "        float: none !important;\n" +
                "\n" +
                "        margin: 15px auto !important;\n" +
                "\n" +
                "        text-align: center !important;\n" +
                "\n" +
                "      }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "  </style>\n" +
                "  \n" +
                "  \n" +
                "  \n" +
                "  \n" +
                "\n" +
                "\n" +
                "<table bgcolor=\"#F5F6F7\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" height=\"100%\" id=\"bodyTable\" style=\"border-collapse: collapse;table-layout: fixed;margin:0 auto;\" width=\"100%\">\n" +
                "  <tbody>\n" +
                "    <tr class=\"desktop-padding\">\n" +
                "      <td height=\"24\" style=\"font-size: 0; line-height: 0;\">&nbsp;</td>\n" +
                "    </tr>\n" +
                "    \n" +
                "    <tr valign=\"top\">\n" +
                "      <td>\n" +
                "      <table align=\"center\" bgcolor=\"#FDFDFE\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"email-container\" style=\"width:100%;max-width:580px; margin: auto; border: 1px solid #dfdfdf;border-bottom: 0 none;border-collapse: initial; border-radius: 2px 3px 0 0;\">\n" +
                "        <tbody>\n" +
                "          <tr>\n" +
                "            <td style=\"padding: 25px 22px;text-align: left; border-bottom: 1px solid #F5F5F6\" valign=\"middle\"><span class=\"sg-image\" data-imagelibrary=\"%7B%22width%22%3A%22109%22%2C%22height%22%3A%2224%22%2C%22alt_text%22%3A%22%22%2C%22alignment%22%3A%22%22%2C%22src%22%3A%22https%3A//sketchapp.com/images/newsletter/sketch-brand@2x.png%22%2C%22classes%22%3A%7B%22sg-image%22%3A1%7D%2C%22link%22%3A%22%22%7D\"><img border=\"0\" height=\"24\" src=\"http://116.196.93.91:8080/myapp/maillogo2.png\" style=\"width: 109px; height: 24px;\" width=\"109\"></span></td>\n" +
                "          </tr>\n" +
                "        </tbody>\n" +
                "      </table>\n" +
                "      \n" +
                "\n" +
                "      <table align=\"center\" bgcolor=\"#ffffff\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"email-container\" style=\"width:100%;max-width:580px;border: 1px solid #dfdfdf; border-top: 0 none; margin: auto; border-collapse: initial; border-radius: 0 0 3px 3px;\">\n" +
                "        <tbody>\n" +
                "          <tr>\n" +
                "            <td>\n" +
                "            <table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" width=\"100%\">\n" +
                "              <tbody>\n" +
                "                <tr>\n" +
                "                  <td style=\"padding: 44px 25px 56px; font-family: -apple-system, BlinkMacSystemFont, sans-serif; font-size: 16px; line-height: 24px;letter-spacing: -.32px;color: #262626;\">\n" +
                "                  <h1 style=\"font-family: -apple-system, BlinkMacSystemFont, sans-serif;font-size: 34px;line-height: 40px;color: #000000;margin: 0 0 32px;font-weight: 600;letter-spacing: -.36px;\">";
        String property1 = PropertiesUtil.getProperty("mail.Text1");
        String text2="<br>\n" +
                "                  <table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"button\" style=\"margin: 0; border-collapse: separate;\">\n" +
                "                    <tbody>\n" +
                "                      <tr>\n" +
                "                        <td style=\"-webkit-border-radius: 2px; -moz-border-radius: 2px; border-radius: 2px; padding: 16px; font-size: 24px;font-weight: 500;background-color: #FBFBFC;border: 1px dashed #D5D5D6 !important;\">"+code+"</td>\n" +
                "                      </tr>\n" +
                "                    </tbody>\n" +
                "                  </table>\n" +
                "                  <br>";
        String property2 = PropertiesUtil.getProperty("mail.Text2");
        Long time=new Date().getTime();
        Long time1 = Long.parseLong("2596000000");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date=dateFormat.format(time + time1).toString()+"，";
        String text4 = PropertiesUtil.getProperty("mail.Text3");
        String text5=".<br>\n" +"<br>\n" +"<em style=\"font-family: -apple-system, BlinkMacSystemFont, sans-serif; font-size: 16px; line-height: 24px;letter-spacing: -.32px;color: #262626;\">The VXN Team</em></td>\n" +"</tr>\n" +"</tbody>\n" +"</table>\n" +"</td>\n" +
                "          </tr>\n" +
                "          \n" +
                "        </tbody>\n" +
                "      </table>\n" +
                "      </td>\n" +
                "    </tr>\n" +
                "    \n" +
                "    <tr class=\"desktop-padding\">\n" +
                "      <td height=\"24\" style=\"font-size: 0; line-height: 0;\">&nbsp;</td>\n" +
                "    </tr>\n" +
                "    \n" +
                "  </tbody>\n" +
                "</table>\n" +
                "\n" +
                "<img src=\"http://link.sketchapp.com/wf/open?upn=XmN3LDRCPc1ePwfZvfLaPiewLpi4LkBvN90nsrdJhlClj4mA6TZSwgh5g8HHd1nZYAwf3kY-2FUmGIuJ395lkDdo59zT7Y6K533ybzB7Asgg11d9ggQ8syXI25X6A8YR21z4xvA3DxHuD4fDHf7PzxzCNWevdR9XUUiwcMJ5B49AZqrU7KG998uSqX47a7UtfbZgDKeMV1ROyque9jiBHAX-2BhHM63DIVywVq2el9toWyg-3D\" width=\"1\" height=\"1\" border=\"0\" style=\"height:1px !important;width:1px !important;border-width:0 !important;margin-top:0 !important;margin-bottom:0 !important;margin-right:0 !important;margin-left:0 !important;padding-top:0 !important;padding-bottom:0 !important;padding-right:0 !important;padding-left:0 !important;\">\n" +
                "\n" +
                "\n" +
                "\n" +
                "<style type=\"text/css\">.qmbox style, .qmbox script, .qmbox head, .qmbox link, .qmbox meta {display: none !important;}</style></div></div><!-- --><style>#mailContentContainer .txt {height:auto;}</style>  </div>\n" +
                "</html>";


        return text1+property1+text2+property2+date+text4+text5;
    }
}
