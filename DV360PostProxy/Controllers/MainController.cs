using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;
using log4net;
using System.IO;
using DV360PostProxy.Dataview;

namespace DV360PostProxy.Controllers
{
    public class MainController : Controller
    {
        private readonly ILog logger = LogManager.GetLogger(typeof(MainController));

        //
        // GET: /Main/

        /// <summary>
        /// Action to allow us to see the application is running
        /// </summary>
        /// <returns></returns>
        public ActionResult Index()
        {
            return View();
        }

        /// <summary>
        /// postback action - accepts http post and forwards to DV360. 
        /// </summary>
        /// <returns></returns>
        [HttpPost]
        public ActionResult Send()
        {
            try
            {
                String strPostData;
                using (StreamReader reader = new StreamReader(Request.InputStream))
                {
                    strPostData = reader.ReadToEnd();
                    logger.Info("PostData = " + strPostData);
                }

                DataviewService Service = new DataviewService();
                String strResult = Service.ProcessApplication(strPostData);

                return Content(strResult, "application/xml");
            }
            catch (Exception ex)
            {
                logger.Error("Error in Main/Send", ex);
                Response.StatusCode = 500;
                return Content("Error accepting data: " + ex.Message);
            }
        }
    }
}
