package in.learnjavaskills;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Request, Response> {
    /**
     * Accept a Request object containing two parameters: an integer 'id' and a string 'message'.
     * Log the received request and then return a 200 status response with a success message.
     */
    @Override
    public Response handleRequest(Request request, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("Lambda handler request function invoked with request : " + request.toString());
        return new Response(200, "Success");
    }
}
