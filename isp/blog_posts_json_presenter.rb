module BlogPostsJsonPresenter
  extend self

  def jsonify posts
    posts.map do |post|
      {
        byline:    post.read_page_attribute('byline'),
        category:  post.parent_label,
        image_url: post.reference_image_path,
        label:     post.label,
        link:      post.full_path,
        summary:   post.read_page_attribute('summary'),
        type:      post.pageable_type,
      }
    end
  end
end
