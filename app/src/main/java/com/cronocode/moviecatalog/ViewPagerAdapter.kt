import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.cronocode.moviecatalog.CourseCurriculum
import com.cronocode.moviecatalog.CourseOverview
import com.cronocode.moviecatalog.CourseReview
import com.cronocode.moviecatalog.CourseInstructor
import com.cronocode.moviecatalog.models.Courses1

class ViewPagerAdapter(fm:FragmentManager, result: Courses1) : FragmentPagerAdapter(fm) {
    var courseData = result;
    override fun getCount(): Int {
        return 4;
    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
                return CourseCurriculum(courseData)
            }
            1 -> {
                return CourseOverview(courseData)
            }
            2 -> {
                return CourseReview(courseData)
            }
            3 ->{
                return CourseInstructor(courseData)
            }
            else -> {
                return Fragment()
            }
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "Curriculum"
            }
            1 -> {
                return "Overview"
            }
            2 -> {
                return "Review"
            }
            3 ->{
                return "Instructor"
            }
        }
        return super.getPageTitle(position)
    }

}
